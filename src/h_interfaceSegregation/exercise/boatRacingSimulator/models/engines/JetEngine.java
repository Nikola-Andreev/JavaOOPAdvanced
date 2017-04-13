package h_interfaceSegregation.exercise.boatRacingSimulator.models.engines;

public class JetEngine extends Engine {

    private static final int MULTIPLIER = 5;

    public JetEngine(String model, int horsepower, int displacement) {
        super(model, horsepower, displacement);
        super.setCachedOutput((super.getHorsepower() * MULTIPLIER) + super.getDisplacement());
    }

    @Override
    public int getOutput() {
        return super.getCachedOutput();
    }
}
