package j_objectCommunicationAndEvents.lab.interfaces.observer;

public interface Subject {

    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}
