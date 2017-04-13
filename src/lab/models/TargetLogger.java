package lab.models;

import lab.abstractClasses.Logger;
import lab.enums.LogType;

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
