package e_enumerationsAndAnotations.lab.b_warningLevels;

public class Message {

    private Importance level;
    private String content;

    public Message(Importance level, String content) {
        this.setLevel(level);
        this.setContent(content);
    }

    Importance getLevel() {
        return this.level;
    }

    private void setLevel(Importance level) {
        this.level = level;
    }

    private String getContent() {
        return this.content;
    }

    private void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return this.getLevel() + ": " + this.getContent();
    }
}