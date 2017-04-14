package j_objectCommunicationAndEvents.lab.interfaces;

import j_objectCommunicationAndEvents.lab.interfaces.observer.ObservableTarget;

public interface Attacker {
    void attack();
    void setTarget(ObservableTarget target);
}
