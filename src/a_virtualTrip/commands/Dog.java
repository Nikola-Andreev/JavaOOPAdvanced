package a_virtualTrip.commands;

import a_virtualTrip.anotations.Command;

@Command("d")
public class Dog implements Executable {
    @Override
    public void executeCommand() {
        System.out.println("I am a dog.");
    }
}
