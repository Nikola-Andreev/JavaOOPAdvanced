package j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.strategies;

import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.interfaces.Strategy;

public class AdditionStrategy implements Strategy{

    private static AdditionStrategy instance = new AdditionStrategy();

    private AdditionStrategy() {}

    public static Strategy getInstance() {
        return instance;
    }

    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
