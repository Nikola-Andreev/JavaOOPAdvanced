package j_objectCommunicationAndEvents.lab.models.commands;

import j_objectCommunicationAndEvents.lab.interfaces.Attacker;
import j_objectCommunicationAndEvents.lab.interfaces.command.Command;
import j_objectCommunicationAndEvents.lab.interfaces.observer.ObservableTarget;

public class TargetCommand implements Command {

    private Attacker attacker;
    private ObservableTarget target;

    public TargetCommand(Attacker attacker, ObservableTarget target) {
        this.attacker = attacker;
        this.target = target;
    }

    @Override
    public void execute() {
        attacker.setTarget(target);
    }
}
