package A_VirtualTrip.commands;

import A_VirtualTrip.anotations.Command;

@Command("c")
public class Cat implements Executable {
    @Override
    public void executeCommand() {
        System.out.println("I am a cat.");
    }
}
