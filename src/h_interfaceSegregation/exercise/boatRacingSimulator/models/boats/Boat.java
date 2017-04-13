package h_interfaceSegregation.exercise.boatRacingSimulator.models.boats;

import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Constants;
import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Validator;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IBoat;

public abstract class Boat implements IBoat {

    private String model;
    private String boatType;
    private int weight;

    Boat(String model, String boatType, int weight) {
        this.setModel(model);
        this.setWeight(weight);
        this.boatType = boatType;
    }

    public String getBoatType() {
        return boatType;
    }

    @Override
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        Validator.ValidateModelLength(model, Constants.MIN_BOAT_MODEL_LENGTH);
        this.model = model;
    }

    int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        Validator.ValidatePropertyValue(weight, "Weight");
        this.weight = weight;
    }
}