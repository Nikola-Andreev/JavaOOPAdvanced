package b_interface.exercises.D_BorderControll;

public class Person implements Identificatable {

    private String id;

    public Person(String id) {
        this.id = id;
    }

    @Override
    public String getID() {
        return this.id;
    }
}
