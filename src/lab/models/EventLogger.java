package lab.models;

import lab.abstractClasses.Logger;
import lab.enums.LogType;

public class EventLogger extends Logger {

    @Override
    public void handle(LogType type, String message) {

        if (type == LogType.EVENT) {
            System.out.println(type.name() + ": " + message);
        } else {
            super.passToSuccessor(type, message);
        }
    }
}
