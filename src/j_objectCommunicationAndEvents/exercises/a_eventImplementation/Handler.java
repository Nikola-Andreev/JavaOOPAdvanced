package j_objectCommunicationAndEvents.exercises.a_eventImplementation;

public class Handler implements NameChangeListener {

    @Override
    public void handleChangedName(NameChange event) {
        System.out.println("Dispatcher's name changed to " + event.getName() + ".");
    }
}
