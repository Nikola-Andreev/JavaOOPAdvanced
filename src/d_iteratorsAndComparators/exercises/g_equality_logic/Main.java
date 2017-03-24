package d_iteratorsAndComparators.exercises.g_equality_logic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<Person> tset = new TreeSet<>(new PersonComparator());
        HashSet<Person> hset = new HashSet<>();

        int number = Integer.parseInt(scan.readLine());
        for (int i = 0; i < number; i++) {
            String[] input = scan.readLine().split("\\s+");
            Person p = new Person(input[0], Integer.valueOf(input[1]));
            tset.add(p);
            hset.add(p);
        }

        System.out.println(tset.size());
        System.out.println(hset.size());
    }
}
