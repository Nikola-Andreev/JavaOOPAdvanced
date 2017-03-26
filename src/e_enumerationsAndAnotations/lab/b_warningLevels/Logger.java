package e_enumerationsAndAnotations.lab.b_warningLevels;

import java.util.ArrayList;
import java.util.List;

public class Logger {

    private Importance level;
    private List<Message> messages;

    public Logger(Importance level) {
        this.level = level;
        this.messages = new ArrayList<>();
    }

    public void add (Message message) {
        if (message.getLevel().compareTo(this.level) >= 0) {
            this.messages.add(message);
        }
    }

    Iterable<Message> getMessages() {
        return this.messages;
    }
}