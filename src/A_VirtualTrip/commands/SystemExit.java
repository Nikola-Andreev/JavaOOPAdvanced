package A_VirtualTrip.commands;

import A_VirtualTrip.anotations.Command;

@Command("exit")
public class SystemExit implements Executable{
    @Override
    public void executeCommand() {
        System.exit(0);
    }
}
