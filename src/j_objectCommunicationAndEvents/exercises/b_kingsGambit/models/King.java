package j_objectCommunicationAndEvents.exercises.b_kingsGambit.models;

import j_objectCommunicationAndEvents.exercises.b_kingsGambit.abstractClasses.KingdomUnit;

public class King extends KingdomUnit{

    // Singleton pattern
    private static King instance = new King("");

    private King(String name) {
        super(name);
    }

    static King getInstance() {
        return instance;
    }

    @Override
    public String respondToAttack() {
        return "King " + this.getName() + " is under attack!";
    }

    @Override
    public boolean tryToKill() {
        return false;
    }
}
