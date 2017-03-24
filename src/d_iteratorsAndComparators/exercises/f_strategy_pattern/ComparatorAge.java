package d_iteratorsAndComparators.exercises.f_strategy_pattern;

import java.util.Comparator;

public class ComparatorAge implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2) {
        return Integer.compare(p1.getAge(), p2.getAge());
    }
}
