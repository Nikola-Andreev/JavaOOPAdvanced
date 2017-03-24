package a_virtualTrip.commands;

import a_virtualTrip.anotations.Command;

@Command("exit")
public class SystemExit implements Executable{
    @Override
    public void executeCommand() {
        System.exit(0);
    }
}
