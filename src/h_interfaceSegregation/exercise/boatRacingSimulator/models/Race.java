package h_interfaceSegregation.exercise.boatRacingSimulator.models;

import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Constants;
import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Validator;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IBoat;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IRace;
import h_interfaceSegregation.exercise.boatRacingSimulator.exeptions.DuplicateModelException;

import java.util.*;

public class Race implements IRace {

    private int distance;
    private int windSpeed;
    private int oseanCurrentSpeed;
    private Boolean allowsMotorBoats;
    private Map<String, IBoat> registeredBoats;

    public Race(int distance, int windSpeed, int oceanCurrentSpeed, Boolean allowsMotorBoats) {
        this.setDistance(distance);
        this.setWindSpeed(windSpeed);
        this.setOseanCurrentSpeed(oceanCurrentSpeed);
        this.setAllowsMotorBoats(allowsMotorBoats);
        this.registeredBoats = new LinkedHashMap<>();
    }

    @Override
    public int getDistance() {
        return distance;
    }

    private void setDistance(int distance) {
        Validator.ValidatePropertyValue(distance, "Distance");
        this.distance = distance;
    }

    @Override
    public int getWindSpeed() {
        return windSpeed;
    }

    private void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getOceanCurrentSpeed() {
        return oseanCurrentSpeed;
    }

    private void setOseanCurrentSpeed(int oseanCurrentSpeed) {
        this.oseanCurrentSpeed = oseanCurrentSpeed;
    }

    public Boolean getAllowsMotorboats() {
        return allowsMotorBoats;
    }

    private void setAllowsMotorBoats(Boolean allowsMotorBoats) {
        this.allowsMotorBoats = allowsMotorBoats;
    }

    private Map<String, IBoat> getRegisteredBoats() {
        return Collections.unmodifiableMap(this.registeredBoats);
    }

    public void AddParticipant(IBoat boat) throws DuplicateModelException {
        if (this.getRegisteredBoats().containsKey(boat.getModel())) {
            throw new DuplicateModelException(Constants.DUPLICATE_MODEL_MESSAGE);
        }
        this.registeredBoats.put(boat.getModel(), boat);
    }

    public List<IBoat> GetParticipants() {
        return Collections.unmodifiableList(new ArrayList<>(this.registeredBoats.values()));
    }
}