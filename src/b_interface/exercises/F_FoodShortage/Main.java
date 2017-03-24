package b_interface.exercises.F_FoodShortage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Buyer> buyers = new HashMap<>();
        int number = Integer.parseInt(scan.readLine());

        for (int i = 0; i < number; i++) {
            String[] input = scan.readLine().split("\\s+");
            if (input.length == 3) {
                buyers.put(input[0], new Citizen(input[0]));
            } else {
                buyers.put(input[0], new Rebel(input[0]));
            }
        }

        while (true) {
            String input = scan.readLine();
            if ("End".equals(input)) break;
            if (buyers.containsKey(input)) {
                buyers.get(input).buyFood();
            }
        }

        System.out.println(buyers.values().stream().mapToInt(Buyer::getFood).sum());
    }
}