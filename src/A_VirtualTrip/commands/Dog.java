package A_VirtualTrip.commands;

import A_VirtualTrip.anotations.Command;

@Command("d")
public class Dog implements Executable {
    @Override
    public void executeCommand() {
        System.out.println("I am a dog.");
    }
}
