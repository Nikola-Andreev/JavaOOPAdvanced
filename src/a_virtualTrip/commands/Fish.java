package a_virtualTrip.commands;

import a_virtualTrip.anotations.Command;

@Command("f")
public class Fish implements Executable {
    @Override
    public void executeCommand() {
        System.out.println("I am a fish.");
    }
}
