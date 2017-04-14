package j_objectCommunicationAndEvents.lab.models.commands;

import j_objectCommunicationAndEvents.lab.interfaces.AttackGroup;
import j_objectCommunicationAndEvents.lab.interfaces.command.Command;

public class GroupAttackCommand implements Command {

    private AttackGroup group;

    public GroupAttackCommand(AttackGroup group) {
        this.group = group;
    }

    @Override
    public void execute() {
        group.groupAttack();
    }
}
