package h_interfaceSegregation.exercise.boatRacingSimulator.models.engines;

public class SterndriveEngine extends Engine {

    private static final int MULTIPLIER = 7;

    public SterndriveEngine(String model, int horsepower, int displacement) {
        super(model, horsepower, displacement);
        super.setCachedOutput((super.getHorsepower() * MULTIPLIER) + super.getDisplacement());
    }

    public int getOutput() {
        return super.getCachedOutput();
    }
}