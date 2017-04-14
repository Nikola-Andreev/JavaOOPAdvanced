package j_objectCommunicationAndEvents.lab.interfaces;

import j_objectCommunicationAndEvents.lab.interfaces.observer.ObservableTarget;

public interface AttackGroup {

    void addMember(Attacker attacker);
    void groupTarget(ObservableTarget target);
    void groupAttack();
}
