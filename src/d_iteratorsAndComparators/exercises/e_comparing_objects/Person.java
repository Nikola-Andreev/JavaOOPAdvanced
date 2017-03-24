package d_iteratorsAndComparators.exercises.e_comparing_objects;

public class Person implements Comparable<Person>{

    private int age;
    private String name;
    private String town;

    public Person(String name, int age,  String town) {
        this.age = age;
        this.name = name;
        this.town = town;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public String getTown() {
        return this.town;
    }

    @Override
    public int compareTo(Person p) {
        if (this.name.compareTo(p.getName()) == 0) {
            if (this.getAge() > p.getAge()) {
                return this.getTown().compareTo(p.getTown());
            }
            return Integer.compare(this.getAge(), p.getAge());
        }
        return this.name.compareTo(p.getName());
    }
}