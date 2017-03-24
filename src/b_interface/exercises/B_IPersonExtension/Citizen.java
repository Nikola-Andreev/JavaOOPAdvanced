package b_interface.exercises.B_IPersonExtension;

public class Citizen implements Person, Birthable, Identifiable {
    private String name;
    private Integer age;
    private String id;
    private String birthdate;

    Citizen(String name, Integer age, String id, String birthdate) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
