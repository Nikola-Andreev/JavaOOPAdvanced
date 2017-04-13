package h_interfaceSegregation.exercise.boatRacingSimulator.models.engines;

import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Constants;
import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Validator;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IEngine;

public abstract class Engine implements IEngine {

    private int cachedOutput;

    protected String model;

    private int horsepower;

    private int displacement;

    protected Engine(String model, int horsepower, int displacement) {
        this.setModel(model);
        this.setHorsepower(horsepower);
        this.setDisplacement(displacement);
    }

    public void setModel(String model) {
        Validator.ValidateModelLength(model, Constants.MIN_BOAT_ENGINE_MODEL_LENGTH);
        this.model = model;
    }

    int getCachedOutput() {
        return this.cachedOutput;
    }

    void setCachedOutput(int cachedOutput) {
        this.cachedOutput = cachedOutput;
    }

    int getHorsepower() {
        return this.horsepower;
    }

    int getDisplacement() {
        return this.displacement;
    }

    private void setHorsepower(int horsepower) {
        Validator.ValidatePropertyValue(horsepower, "Horsepower");
        this.horsepower = horsepower;
    }

    private void setDisplacement(int displacement) {
        Validator.ValidatePropertyValue(displacement, "Displacement");
        this.displacement = displacement;
    }

    @Override
    public String getModel() {
        return this.model;
    }
}