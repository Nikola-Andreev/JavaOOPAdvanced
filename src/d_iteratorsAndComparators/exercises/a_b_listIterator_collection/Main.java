package d_iteratorsAndComparators.exercises.a_b_listIterator_collection;

import d_iteratorsAndComparators.exercises.a_b_listIterator_collection.interfaces.CommandInterpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        CommandInterpreter interpreter = new CommandInterpreterImpl();

        while (true) {
            String[] input = scan.readLine().split("\\s+");
            if (input[0].equals("END")) break;
            interpreter.interpretCommand(input);
        }
    }
}