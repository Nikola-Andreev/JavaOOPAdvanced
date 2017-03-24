package d_iteratorsAndComparators.exercises.f_strategy_pattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Person> personsName = new TreeSet<>(new ComparatorAge());
        TreeSet<Person> personsAge = new TreeSet<>(new ComparatorName());

        int number = Integer.parseInt(scan.readLine());
        for (int r = 0; r < number; r++) {
            String[] input = scan.readLine().split("\\s+");
            Person p = new Person(input[0], Integer.valueOf(input[1]));
            personsAge.add(p);
            personsName.add(p);
        }

        for (Person person : personsAge) {
            System.out.println(person);
        }

        for (Person person : personsName) {
            System.out.println(person);
        }
    }
}
