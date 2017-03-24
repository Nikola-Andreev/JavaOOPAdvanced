package d_iteratorsAndComparators.exercises.f_strategy_pattern;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}
