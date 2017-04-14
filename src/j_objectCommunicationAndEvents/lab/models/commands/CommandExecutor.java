package j_objectCommunicationAndEvents.lab.models.commands;

import j_objectCommunicationAndEvents.lab.interfaces.command.Command;
import j_objectCommunicationAndEvents.lab.interfaces.command.Executor;

public class CommandExecutor implements Executor {

    @Override
    public void executeCommand(Command command) {
        command.execute();
    }
}
