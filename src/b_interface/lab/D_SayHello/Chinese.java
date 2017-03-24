package b_interface.lab.D_SayHello;

public class Chinese extends BasePerson implements Person{

    Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
