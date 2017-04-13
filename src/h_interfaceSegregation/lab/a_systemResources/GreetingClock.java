package h_interfaceSegregation.lab.a_systemResources;

public class GreetingClock {

    private TimeProvider time;
    private Writer writer;

    public GreetingClock(TimeProvider provider, Writer writer) {
        this.time = provider;
        this.writer = writer;
    }

    public void greeting() {
        if (this.time.getHour() < 12) {
            this.writer.println("Good morning...");
        } else if (this.time.getHour() < 18) {
            this.writer.println("Good afternoon...");
        } else {
            this.writer.println("Good evening...");
        }
    }
}
