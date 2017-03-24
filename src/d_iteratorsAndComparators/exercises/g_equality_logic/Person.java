package d_iteratorsAndComparators.exercises.g_equality_logic;

public class Person {

    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object obj) {
        Person person = (Person) obj;
        return !(obj == null || obj.getClass() != this.getClass())
                && person.getName().equals(this.getName())
                && person.getAge() == (this.getAge());
    }

    @Override
    public int hashCode() {
        return this.getName().hashCode() * this.age.hashCode();
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}