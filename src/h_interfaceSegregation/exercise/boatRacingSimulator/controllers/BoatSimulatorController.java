package h_interfaceSegregation.exercise.boatRacingSimulator.controllers;

import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Constants;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.*;
import h_interfaceSegregation.exercise.boatRacingSimulator.database.BoatSimulatorDatabase;
import h_interfaceSegregation.exercise.boatRacingSimulator.enumeration.EngineType;
import h_interfaceSegregation.exercise.boatRacingSimulator.exeptions.*;
import h_interfaceSegregation.exercise.boatRacingSimulator.models.*;
import h_interfaceSegregation.exercise.boatRacingSimulator.models.boats.*;
import h_interfaceSegregation.exercise.boatRacingSimulator.models.engines.JetEngine;
import h_interfaceSegregation.exercise.boatRacingSimulator.models.engines.SterndriveEngine;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.*;

public class BoatSimulatorController implements IBoatSimulatorController {

    private Map<Double, IBoat> map;
    private BoatSimulatorDatabase database;
    private IRace currentRace;

    public BoatSimulatorController() {
        this.database = new BoatSimulatorDatabase();
        this.currentRace = null;
        this.map = new TreeMap<>();
    }

    public String CreateBoatEngine(String model, int horsepower, int displacement, EngineType engineType) throws DuplicateModelException {

        IEngine engine;
        switch (engineType) {
            case Jet:
                engine = new JetEngine(model, horsepower, displacement);
                break;
            case Sterndrive:
                engine = new SterndriveEngine(model, horsepower, displacement);
                break;
            default:
                throw new NotImplementedException();
        }

        this.database.getEngines().Add(engine);
        return String.format(
                "Controller model %s with %s HP and displacement %s cm3 created successfully.", model, horsepower, displacement);
    }

    public String CreateRowBoat(String model, int weight, int oars) throws DuplicateModelException {
        IBoat boat = new RowBoat(model, "RowBoat", weight, oars );
        this.database.getBoats().Add(boat);
        return String.format("Row boat with model %s registered successfully.", model);
    }

    public String CreateSailBoat(String model, int weight, int sailEfficiency) throws DuplicateModelException {
        IBoat boat = new SailBoat(model, "SailBoat", weight, sailEfficiency);
        this.database.getBoats().Add(boat);
        return String.format("Sail boat with model %s registered successfully.", model);
    }

    public String CreatePowerBoat(String model, int weight, String firstEngineModel, String secondEngineModel)
            throws NonExistantModelException, DuplicateModelException {
        IEngine firstEngine = this.database.getEngines().GetItem(firstEngineModel);
        IEngine secondEngine = this.database.getEngines().GetItem(secondEngineModel);
        IBoat boat = new PowerBoat(model, "PowerBoat", weight, firstEngine, secondEngine);
        this.database.getBoats().Add(boat);
        return String.format("Power boat with model %s registered successfully.", model);
    }

    public String CreateYacht(String model, int weight, String engineModel, int cargoWeight)
            throws NonExistantModelException, DuplicateModelException {
        IEngine engine = this.database.getEngines().GetItem(engineModel);
        IBoat boat = new Yacht(model, "Yacht", weight, cargoWeight, engine);
        this.database.getBoats().Add(boat);
        return String.format("Yacht with model %s registered successfully.", model);
    }

    public String OpenRace(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorboats)
            throws RaceAlreadyExistsException {
        IRace race = new Race(distance, windSpeed, oceanCurrentSpeed, allowsMotorboats);
        this.ValidateRaceIsEmpty();
        this.currentRace = race;
        return
                String.format(
                        "A new race with distance %s meters, wind speed %s m/s and ocean current speed %s m/s has been set.",
                        distance, windSpeed, oceanCurrentSpeed);
    }

    public String SignUpBoat(String model) throws NonExistantModelException, DuplicateModelException, NoSetRaceException {
        IBoat boat = this.database.getBoats().GetItem(model);
        this.ValidateRaceIsSet();
        if (!this.currentRace.getAllowsMotorboats() &&
                (boat.getBoatType().contains("Yacht") || boat.getBoatType().contains("Power"))) {
            throw new IllegalArgumentException(Constants.INCORRECT_BOAT_TYPE_MESSAGE);
        }
        this.currentRace.AddParticipant(boat);
        return String.format("Boat with model %s has signed up for the current Race.", model);
    }

    public String StartRace() throws InsufficientContestantsException, NoSetRaceException {
        this.ValidateRaceIsSet();
        List<IBoat> participants = this.currentRace.GetParticipants();
        if (participants.size() < 3) {
            throw new InsufficientContestantsException(Constants.INSUFFICIENT_CONTESTANTS_MESSAGE);
        }

        FindFastest(participants);

        StringBuilder result = new StringBuilder();

        List<String> list = new ArrayList<>();
        list.add("First");
        list.add("Second");
        list.add("Third");
        Iterator<String> iterator = list.iterator();

        int counter = 0;
        for (Map.Entry<Double, IBoat> doubleMotorBoatEntry : this.map.entrySet()) {
            if (counter++ == 3) break;
            result.append(String.format("%s place: %s Model: %s Time: %s",
                    iterator.next(),
                    doubleMotorBoatEntry.getValue().getBoatType(),
                    doubleMotorBoatEntry.getValue().getModel(),
                    isFinished(doubleMotorBoatEntry.getKey())));
            result.append(System.lineSeparator());
        }

        this.currentRace = null;
        this.map.clear();
        return result.toString().trim();
    }

    private String isFinished(Double key) {
        if (key >= 100_000_000.0) {
            return "Did not finish!";
        }
        return String.format("%.2f sec", key);
    }

    @Override
    public String GetStatistic() {
        double participants = this.currentRace.GetParticipants().size();
        double powerBoatPercentage = this.currentRace.GetParticipants().stream()
                .filter(p -> p.getBoatType().contains("Power")).count() / participants * 100;
        double rowBoatPercentage = this.currentRace.GetParticipants().stream()
                .filter(p -> p.getBoatType().contains("Row")).count() / participants * 100;
        double sailBoatPercentage = this.currentRace.GetParticipants().stream()
                .filter(p -> p.getBoatType().contains("Sail")).count() / participants * 100;
        double yachtBoatPercentage = this.currentRace.GetParticipants().stream()
                .filter(p -> p.getBoatType().contains("Yacht")).count() / participants * 100;

        return String.format("PowerBoat -> %.2f%% %nRowBoat -> %.2f%% %nSailBoat -> %.2f%% %nYacht -> %.2f%%",
                powerBoatPercentage, rowBoatPercentage, sailBoatPercentage, yachtBoatPercentage);
    }

    private void FindFastest(List<IBoat> participants) {
        int counter = 0;
        for (IBoat participant : participants) {

            Double speed = participant.CalculateRaceSpeed(this.currentRace);
            Double time = this.currentRace.getDistance() / speed;

            if (time <= 0) {
                time =  100_000_000.0 + counter;
            }
            map.put(time + counter++ * 0.000000000001, participant);
        }
    }

    private void ValidateRaceIsSet() throws NoSetRaceException {
        if (this.currentRace == null) {
            throw new NoSetRaceException(Constants.NO_SET_RACE_MESSAGE);
        }
    }

    private void ValidateRaceIsEmpty() throws RaceAlreadyExistsException {
        if (this.currentRace != null) {
            throw new RaceAlreadyExistsException(Constants.RACE_ALREADY_EXISTS_MESSAGE);
        }
    }
}