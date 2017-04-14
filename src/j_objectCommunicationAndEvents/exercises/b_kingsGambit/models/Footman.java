package j_objectCommunicationAndEvents.exercises.b_kingsGambit.models;

import j_objectCommunicationAndEvents.exercises.b_kingsGambit.abstractClasses.KingdomUnit;
import j_objectCommunicationAndEvents.exercises.b_kingsGambit.interfaces.Killed;

public class Footman extends KingdomUnit implements Killed {

    private static final int DEFAULT_FOOTMAN_HEALTH = 2;
    private int health;

    Footman(String name) {
        super(name);
        this.health = DEFAULT_FOOTMAN_HEALTH;
    }

    @Override
    public String respondToAttack() {
        return "Footman " + this.getName() + " is panicking!";
    }

    @Override
    public boolean tryToKill() {
        return --this.health <= 0;
    }
}
