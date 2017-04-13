package lab.interfaces;

import lab.enums.LogType;

public interface Handler {

    void handle(LogType type, String message);
    void setSuccessor(Handler successor);
}
