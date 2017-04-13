package h_interfaceSegregation.exercise.boatRacingSimulator.Core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Engine {

    private CommandHandler commandHandler;

    public Engine(CommandHandler commandHandler)
    {
        this.commandHandler = commandHandler;
    }

    public void Run() throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();

        while (true) {
            String line = scan.readLine();

            if (line.equals("End")) break;

            List<String> tokens = Arrays.asList(line.split("\\\\"));
            String name = tokens.get(0);
            List<String> parameters = tokens.stream().skip(1).collect(Collectors.toList());

            try {
                String commandResult = this.commandHandler.ExecuteCommand(name, parameters);
                result.append(commandResult).append(System.lineSeparator());
            } catch (Exception ex) {
                result.append(ex.getMessage()).append(System.lineSeparator());
            }
        }

        System.out.println(result.toString().trim());
    }
}