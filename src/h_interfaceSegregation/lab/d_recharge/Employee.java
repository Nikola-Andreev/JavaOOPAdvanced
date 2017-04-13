package h_interfaceSegregation.lab.d_recharge;

public class Employee extends Worker implements Sleeper {

    public Employee(String id) {
        super(id);
    }

    public void sleep() {
        // sleep...
    }
}
