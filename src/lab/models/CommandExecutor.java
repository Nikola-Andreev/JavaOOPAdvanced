package lab.models;

import lab.interfaces.Executor;

public class CommandExecutor implements Executor {

    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
