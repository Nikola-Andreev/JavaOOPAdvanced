package j_objectCommunicationAndEvents.lab.models.commands;

import j_objectCommunicationAndEvents.lab.interfaces.AttackGroup;
import j_objectCommunicationAndEvents.lab.interfaces.command.Command;
import j_objectCommunicationAndEvents.lab.interfaces.observer.ObservableTarget;

public class GroupTargetCommand implements Command {

    private ObservableTarget target;
    private AttackGroup group;

    public GroupTargetCommand(AttackGroup group, ObservableTarget target) {
        this.target = target;
        this.group = group;
    }

    @Override
    public void execute() {
        group.groupTarget(target);
    }
}
