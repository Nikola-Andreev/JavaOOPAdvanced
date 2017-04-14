package j_objectCommunicationAndEvents.lab.models;

import j_objectCommunicationAndEvents.lab.abstractClasses.AbstractHero;
import j_objectCommunicationAndEvents.lab.enums.LogType;
import j_objectCommunicationAndEvents.lab.interfaces.Handler;
import j_objectCommunicationAndEvents.lab.interfaces.Target;

public class Warrior extends AbstractHero {

    private static final String ATTACK_MESSAGE = "%s damages %s for %s";

    public Warrior(String id, int dmg, Handler logger) {
        super(id, dmg, logger);
    }

    @Override
    protected void executeClassSpecificAttack(Target target, int dmg, Handler logger) {
        logger.handle(LogType.ATTACK, String.format(ATTACK_MESSAGE, this, target, dmg));
        target.receiveDamage(dmg);
    }
}
