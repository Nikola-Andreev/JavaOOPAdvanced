package j_objectCommunicationAndEvents.exercises.a_eventImplementation;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private String name;
    private List<NameChangeListener> nameChangeListeners;

    Dispatcher() {
        this.nameChangeListeners = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
        this.fireNameChangeEvent();
    }

    void addNameChangeListener(NameChangeListener listener) {
        this.nameChangeListeners.add(listener);
    }

    public void removeNameChangeListener(NameChangeListener listener) {
        this.nameChangeListeners.remove(listener);
    }

    private void fireNameChangeEvent() {
        NameChange event = new NameChange(this.name);
        for (NameChangeListener nameChangeListener : nameChangeListeners) {
            nameChangeListener.handleChangedName(event);
        }
    }
}
