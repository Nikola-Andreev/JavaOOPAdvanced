package e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity;

import e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.classes.CommandInterpreter;
import e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.interfaces.CommandExecutor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        CommandExecutor commandInterpreter = new CommandInterpreter();

        while (true) {
            String[] input = scan.readLine().split(";");
            if (input[0].equals("END")) break;
            commandInterpreter.executeCommand(input);
        }
    }
}