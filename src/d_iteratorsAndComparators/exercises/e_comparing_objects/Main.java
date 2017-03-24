package d_iteratorsAndComparators.exercises.e_comparing_objects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        List<Person> persons = new ArrayList<>();
        int equalPeoples = 0;
        int notEqualPeoples = 0;

        while (true) {
            String[] inputTokens = scan.readLine().split("\\s+");
            if (inputTokens[0].equals("END")) break;
            Person currentPerson = new Person(inputTokens[0], Integer.valueOf(inputTokens[1]), inputTokens[2]);
            persons.add(currentPerson);
        }
        Person p = persons.get(Integer.valueOf(scan.readLine()) - 1);
        for (Person person : persons) {
            if (p.compareTo(person) == 0) {
                equalPeoples++;
            } else {
                notEqualPeoples++;
            }
        }

        System.out.println(equalPeoples > 1 ? equalPeoples + " " + notEqualPeoples + " " + (persons.size()) : "No matches");
    }
}
