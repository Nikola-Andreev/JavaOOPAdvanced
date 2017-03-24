package d_iteratorsAndComparators.exercises.g_equality_logic;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2) {
        if (p1.getName().equals(p2.getName())) {
            return Integer.compare(p1.getAge(), p2.getAge());
        }
        return p1.getName().compareTo(p2.getName());
    }
}
