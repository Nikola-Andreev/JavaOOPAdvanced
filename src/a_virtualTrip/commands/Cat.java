package a_virtualTrip.commands;

import a_virtualTrip.anotations.Command;

@Command("c")
public class Cat implements Executable {
    @Override
    public void executeCommand() {
        System.out.println("I am a cat.");
    }
}
