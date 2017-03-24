package d_iteratorsAndComparators.exercises.f_strategy_pattern;

import java.util.Comparator;

public class ComparatorName implements Comparator<Person>{
    @Override
    public int compare(Person p1, Person p2) {
        if (Integer.compare(p1.getName().length(), p2.getName().length()) == 0) {
            return Integer.compare(Character.toLowerCase(p1.getName().charAt(0)), Character.toLowerCase(p2.getName().charAt(0)));
        }
        return Integer.compare(p1.getName().length(), p2.getName().length());
    }
}
