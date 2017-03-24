package b_interface.exercises.E_BirthdayCelebrations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Identificatable> citizens = new ArrayList<>();
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String[] input = scan.readLine().split("\\s+");
            if (input[0].equals("End")) break;
            if (input.length == 5) {
                citizens.add(new Person(input[4]));
            } else if (input[0].equals("Pet")) {
                citizens.add(new Pet(input[2]));
            }
        }

        String targetDate = scan.readLine();
        for (Identificatable citizen : citizens) {
            if (citizen.getBirthDate().endsWith(targetDate)) {
                System.out.println(citizen.getBirthDate());
            }
        }
    }
}