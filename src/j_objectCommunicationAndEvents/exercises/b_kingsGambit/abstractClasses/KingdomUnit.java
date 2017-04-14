package j_objectCommunicationAndEvents.exercises.b_kingsGambit.abstractClasses;

import j_objectCommunicationAndEvents.exercises.b_kingsGambit.interfaces.Attacked;

public abstract class KingdomUnit implements Attacked{

    private String name;

    protected KingdomUnit(String name) {
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
