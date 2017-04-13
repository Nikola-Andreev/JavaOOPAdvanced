package lab;

import lab.abstractClasses.Logger;
import lab.models.AttackGroup;
import lab.models.Command;
import lab.interfaces.Executor;
import lab.models.Target;
import lab.models.*;
import lab.models.CommandExecutor;
import lab.models.CombatLogger;
import lab.models.EventLogger;
import lab.models.Group;
import lab.models.GroupAttackCommand;
import lab.models.GroupTargetCommand;

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

        Target dragon = new Dragon("Dragon", 100, 25, combatLogger);

        Executor commandExecutor = new CommandExecutor();
        Command groupTarget = new GroupTargetCommand(group, dragon);
        Command attackCommand = new GroupAttackCommand(group);

        commandExecutor.executeCommand(groupTarget);
        commandExecutor.executeCommand(attackCommand);
    }
}