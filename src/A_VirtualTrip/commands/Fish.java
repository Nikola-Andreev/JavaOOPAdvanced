package A_VirtualTrip.commands;

import A_VirtualTrip.anotations.Command;

@Command("f")
public class Fish implements Executable {
    @Override
    public void executeCommand() {
        System.out.println("I am a fish.");
    }
}
