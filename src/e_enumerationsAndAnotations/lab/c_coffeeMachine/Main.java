package e_enumerationsAndAnotations.lab.c_coffeeMachine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        CoffeeMachine cm = new CoffeeMachine();

        while (true) {
            String[] input = scan.readLine().split("\\s+");
            if (input[0].equals("END")) break;

            try {
                cm.insertCoin(input[0]);
            } catch (IllegalArgumentException e) {
                cm.buyCoffee(input[0], input[1]);
            }
        }

        for (Coffee coffee : cm.coffeesSold()) {
            System.out.println(coffee);
        }
    }
}
