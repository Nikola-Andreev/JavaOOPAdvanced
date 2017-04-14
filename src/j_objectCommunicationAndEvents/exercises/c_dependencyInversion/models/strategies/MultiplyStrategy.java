package j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.strategies;

import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.interfaces.Strategy;

public class MultiplyStrategy implements Strategy {

    private static MultiplyStrategy instance = new MultiplyStrategy();

    private MultiplyStrategy() {}

    public static MultiplyStrategy getInstance() {
        return instance;
    }

    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
