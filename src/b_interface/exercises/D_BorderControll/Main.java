package b_interface.exercises.D_BorderControll;

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
            if (input.length == 3) {
                citizens.add(new Person(input[2]));
            } else {
                citizens.add(new Person(input[1]));
            }
        }

        String targetId = scan.readLine();
        for (Identificatable citizen : citizens) {
            if (citizen.getID().endsWith(targetId)) {
                System.out.println(citizen.getID());
            }
        }
    }
}
