package j_objectCommunicationAndEvents.lab;

import j_objectCommunicationAndEvents.lab.abstractClasses.Logger;
import j_objectCommunicationAndEvents.lab.interfaces.AttackGroup;
import j_objectCommunicationAndEvents.lab.interfaces.command.Command;
import j_objectCommunicationAndEvents.lab.interfaces.command.Executor;
import j_objectCommunicationAndEvents.lab.interfaces.observer.ObservableTarget;
import j_objectCommunicationAndEvents.lab.models.*;
import j_objectCommunicationAndEvents.lab.models.commands.CommandExecutor;
import j_objectCommunicationAndEvents.lab.models.loggers.CombatLogger;
import j_objectCommunicationAndEvents.lab.models.loggers.EventLogger;
import j_objectCommunicationAndEvents.lab.models.Group;
import j_objectCommunicationAndEvents.lab.models.commands.GroupAttackCommand;
import j_objectCommunicationAndEvents.lab.models.commands.GroupTargetCommand;

public class Main {
    public static void main(String[] args) {

        Logger combatLogger = new CombatLogger();
        Logger eventLogger = new EventLogger();
        //Logger targetLogger = new TargetLogger();

        combatLogger.setSuccessor(eventLogger);
        //eventLogger.setSuccessor(targetLogger);

        AttackGroup group = new Group();
        group.addMember(new Warrior("Warrior", 10 , combatLogger));
        group.addMember(new Warrior("ElderWarrior", 13, combatLogger));

        ObservableTarget dragon = new Dragon("Dragon", 10, 25, combatLogger);

        Executor commandExecutor = new CommandExecutor();
        Command groupTarget = new GroupTargetCommand(group, dragon);
        Command attackCommand = new GroupAttackCommand(group);

        commandExecutor.executeCommand(groupTarget);
        commandExecutor.executeCommand(attackCommand);
    }
}