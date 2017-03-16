package A_VirtualTrip;

import A_VirtualTrip.anotations.Command;
import A_VirtualTrip.commands.Executable;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Executable> commands = new HashMap<>();


        while (true) {
            String input = scan.readLine();
            if (commands.containsKey(input)) {
                commands.get(input).executeCommand();
                continue;
            }
            for (File cmdFile : new File("src/A_VirtualTrip/commands").listFiles()){
                String fileName = cmdFile.getName().replace(".java", "");
                Class cmdClass = Class.forName("A_VirtualTrip.commands." + fileName);
                if (cmdClass.isAnnotationPresent(Command.class)) {
                    Command annotation = (Command) cmdClass.getDeclaredAnnotation(Command.class);
                    String cmdAlias = annotation.value();
                    if (cmdAlias.equals(input)) {
                        Executable executable = (Executable) cmdClass.newInstance();
                        commands.putIfAbsent(cmdAlias, executable);
                        executable.executeCommand();
                    }
                }
            }
        }
    }
}