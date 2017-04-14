package j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models;

import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.interfaces.Calculator;
import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.interfaces.Strategy;
import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.strategies.AdditionStrategy;

public class PrimitiveCalculator implements Calculator{

    private static Strategy currentStrategy = AdditionStrategy.getInstance();
    private static Calculator instance = new PrimitiveCalculator();

    private PrimitiveCalculator(){}

    public static Calculator getInstance() {
        return instance;
    }

    @Override
    public void changeStrategy(Strategy strategy){
        currentStrategy = strategy;

    }

    @Override
    public int performCalculation(int firstOperand, int secondOperand){
       return currentStrategy.calculate(firstOperand, secondOperand);
    }
}