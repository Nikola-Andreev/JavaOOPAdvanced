package j_objectCommunicationAndEvents.lab.models.loggers;

import j_objectCommunicationAndEvents.lab.abstractClasses.Logger;
import j_objectCommunicationAndEvents.lab.enums.LogType;

public class TargetLogger extends Logger {

    @Override
    public void handle(LogType type, String message) {

        if (type == LogType.TARGET) {
            System.out.println(type.name() + ": " + message);
        } else {
            super.passToSuccessor(type, message);
        }
    }
}
