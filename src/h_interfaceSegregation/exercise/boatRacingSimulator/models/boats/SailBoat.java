package h_interfaceSegregation.exercise.boatRacingSimulator.models.boats;

import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Constants;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IRace;

public class SailBoat extends Boat {

    private int sailEfficiency;

    public SailBoat(String model, String boatType, int weight, int sailEfficiency) {
        super(model, boatType, weight);
        this.setSailEfficiency(sailEfficiency);
    }

    public int getSailEfficiency() {
        return sailEfficiency;
    }

    private void setSailEfficiency(int sailEfficiency) {
        if (sailEfficiency < 1 || sailEfficiency > 100) {
            throw new IllegalArgumentException(Constants.INCORRECT_SAIL_EFFICIENCY_MESSAGE);
        }
        this.sailEfficiency = sailEfficiency;
    }

    @Override
    public double CalculateRaceSpeed(IRace race) {
        return (race.getWindSpeed() * (this.sailEfficiency / 100d)) - super.getWeight() + (race.getOceanCurrentSpeed() / 2d);
    }
}
