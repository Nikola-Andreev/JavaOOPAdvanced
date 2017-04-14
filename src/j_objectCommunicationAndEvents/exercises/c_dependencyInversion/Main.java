package j_objectCommunicationAndEvents.exercises.c_dependencyInversion;

import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.interfaces.Calculator;
import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.interfaces.Strategy;
import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.*;
import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.strategies.AdditionStrategy;
import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.strategies.DivideStrategy;
import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.strategies.MultiplyStrategy;
import j_objectCommunicationAndEvents.exercises.c_dependencyInversion.models.strategies.SubtractionStrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = PrimitiveCalculator.getInstance();

        while (true) {
            String[] input = scan.readLine().split("\\s+");
            if (input[0].equalsIgnoreCase("mode")) {
                calculator.changeStrategy(getCurrentStrategy(input[1].charAt(0)));
            } else if (input[0].equalsIgnoreCase("end")) {
                break;
            } else {
                System.out.println(calculator.performCalculation(Integer.valueOf(input[0]), Integer.valueOf(input[1])));
            }
        }
    }

    private static Strategy getCurrentStrategy(char c) {
        switch (c) {
            case '*' :
                return MultiplyStrategy.getInstance();
            case '/' :
                return DivideStrategy.getInstance();
            case '+' :
                return AdditionStrategy.getInstance();
            case '-' :
                return SubtractionStrategy.getInstance();
            default:
                return null;
        }
    }
}