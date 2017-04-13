package h_interfaceSegregation.exercise.boatRacingSimulator.Core;

import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IBoatSimulatorController;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.ICommandHandler;
import h_interfaceSegregation.exercise.boatRacingSimulator.enumeration.EngineType;
import h_interfaceSegregation.exercise.boatRacingSimulator.exeptions.*;

import java.util.List;

public class CommandHandler implements ICommandHandler {

    private IBoatSimulatorController controller;

    public CommandHandler(IBoatSimulatorController controller) {
        this.setContrller(controller);
    }

    private void setContrller(IBoatSimulatorController controller) {
        this.controller = controller;
    }

    public String ExecuteCommand(String name, List<String> parameters) throws DuplicateModelException,
            NonExistantModelException, RaceAlreadyExistsException, NoSetRaceException, InsufficientContestantsException {
        switch (name) {
            case "CreateBoatEngine":
                EngineType engineType = EngineType.valueOf(parameters.get(3));
                return this.controller.CreateBoatEngine(
                        parameters.get(0),
                        Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)),
                        engineType);

            case "CreateRowBoat":
                return this.controller.CreateRowBoat(
                        parameters.get(0),
                        Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)));
            case "CreateSailBoat":
                return this.controller.CreateSailBoat(
                        parameters.get(0),
                        Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)));
            case "CreatePowerBoat":
                return this.controller.CreatePowerBoat(
                        parameters.get(0),
                        Integer.parseInt(parameters.get(1)),
                        parameters.get(2),
                        parameters.get(3));
            case "CreateYacht":
                return this.controller.CreateYacht(
                        parameters.get(0),
                        Integer.parseInt(parameters.get(1)),
                        parameters.get(2),
                        Integer.parseInt(parameters.get(3)));
            case "OpenRace":
                return this.controller.OpenRace(
                        Integer.parseInt(parameters.get(0)),
                        Integer.parseInt(parameters.get(1)),
                        Integer.parseInt(parameters.get(2)),
                        Boolean.parseBoolean(parameters.get(3)));
            case "SignUpBoat":
                return this.controller.SignUpBoat(parameters.get(0));
            case "StartRace":
                return this.controller.StartRace();
            case "GetStatistic":
                return this.controller.GetStatistic();
            default:
                throw new IllegalArgumentException();
        }
    }
}
