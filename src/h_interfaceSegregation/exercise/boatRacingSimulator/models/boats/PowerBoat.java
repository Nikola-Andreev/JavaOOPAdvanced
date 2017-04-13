package h_interfaceSegregation.exercise.boatRacingSimulator.models.boats;

import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IEngine;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IRace;

public class PowerBoat extends Boat {

    private IEngine jetEngine;
    private IEngine sterndriveEngine;

    public PowerBoat(String model, String boatType, int weight, IEngine jetEngine, IEngine sterndriveEngine) {
        super(model, boatType, weight);
        this.jetEngine = jetEngine;
        this.sterndriveEngine = sterndriveEngine;
    }

    @Override
    public double CalculateRaceSpeed(IRace race) {
        return this.jetEngine.getOutput() + this.sterndriveEngine.getOutput()
                - super.getWeight() + (race.getOceanCurrentSpeed() / 5d);
    }
}
