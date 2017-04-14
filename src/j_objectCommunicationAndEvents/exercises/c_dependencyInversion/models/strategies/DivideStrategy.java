package j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.strategies;

import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.interfaces.Strategy;

public class DivideStrategy implements Strategy {

    private static DivideStrategy instance = new DivideStrategy();

    private DivideStrategy() {}

    public static DivideStrategy getInstance() {
        return instance;
    }

    @Override
    public int calculate(int a, int b) {
        return a / b;
    }
}
