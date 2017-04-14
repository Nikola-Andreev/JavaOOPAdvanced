package j_objectCommunicationAndEvents.lab.interfaces;

import j_objectCommunicationAndEvents.lab.enums.LogType;

public interface Handler {

    void handle(LogType type, String message);
    void setSuccessor(Handler successor);
}
