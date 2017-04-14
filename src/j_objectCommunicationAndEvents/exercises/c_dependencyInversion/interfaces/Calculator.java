package j_objectCommunicationAndEvents.exercises.c_dependencyInversion.interfaces;

public interface Calculator {

    void changeStrategy(Strategy strategy);

    int performCalculation(int firstOperand,int secondOperand);
}
