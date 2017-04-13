package h_interfaceSegregation.exercise.boatRacingSimulator.models.boats;

import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Validator;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IEngine;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IRace;

public class Yacht extends Boat {

    private int cargoWeight;
    private IEngine engine;

    public Yacht(String model, String boatType, int weight, int cargoWeight, IEngine engine) {
        super(model, boatType, weight);
        this.setCargoWeight(cargoWeight);
        this.engine = engine;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    private void setCargoWeight(int cargoWeight) {
        Validator.ValidatePropertyValue(cargoWeight, "Cargo Weight");
        this.cargoWeight = cargoWeight;
    }

    @Override
    public double CalculateRaceSpeed(IRace race) {
        return this.engine.getOutput() - super.getWeight() - this.cargoWeight + (race.getOceanCurrentSpeed() / 2d);
    }
}