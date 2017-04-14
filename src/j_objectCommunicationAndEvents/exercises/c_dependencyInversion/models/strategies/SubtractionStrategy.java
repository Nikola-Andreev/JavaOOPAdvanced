package j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.strategies;

import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.interfaces.Strategy;

public class SubtractionStrategy implements Strategy {

    private static SubtractionStrategy instance = new SubtractionStrategy();

    private SubtractionStrategy() {}

    public static SubtractionStrategy getInstance() {
        return instance;
    }

    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}