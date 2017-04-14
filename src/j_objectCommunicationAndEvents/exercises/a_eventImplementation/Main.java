package j_objectCommunicationAndEvents.exercises.a_eventImplementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Dispatcher dispatcher = new Dispatcher();
        NameChangeListener nameChangeListener = new Handler();
        dispatcher.addNameChangeListener(nameChangeListener);

        while (true) {
            String input = scan.readLine();
            if (input.equals("End")) break;
            dispatcher.setName(input);
        }
    }
}
