package j_objectCommunicationAndEvents.lab.models.commands;

import j_objectCommunicationAndEvents.lab.interfaces.Attacker;
import j_objectCommunicationAndEvents.lab.interfaces.command.Command;

public class AttackCommand implements Command {

    private Attacker attacker;

    public AttackCommand(Attacker attacker) {
        this.attacker = attacker;
    }

    @Override
    public void execute() {
        attacker.attack();
    }
}
