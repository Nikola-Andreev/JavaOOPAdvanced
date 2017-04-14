package j_objectCommunicationAndEvents.exercises.b_kingsGambit.models;

import j_objectCommunicationAndEvents.exercises.b_kingsGambit.abstractClasses.KingdomUnit;
import j_objectCommunicationAndEvents.exercises.b_kingsGambit.interfaces.Killed;

public class RoyalGuard extends KingdomUnit implements Killed{

    private static final int DEFAULT_FOOTMAN_HEALTH = 3;
    private int health;

    RoyalGuard(String name) {
        super(name);
        this.health = DEFAULT_FOOTMAN_HEALTH;
    }

    @Override
    public String respondToAttack() {
        return "Royal Guard " + this.getName() + " is defending!";
    }

    @Override
    public boolean tryToKill() {
        return --this.health <= 0;
    }
}
