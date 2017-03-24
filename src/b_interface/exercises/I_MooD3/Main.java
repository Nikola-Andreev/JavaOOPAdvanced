package b_interface.exercises.I_MooD3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input = scan.readLine().split(" \\| ");

        if (input[1].equals("Demon")) {
            IHero hero = new Demon(input[0], Double.valueOf(input[2]), Integer.valueOf(input[3]));
            System.out.println(hero);
        } else {
            IHero hero = new Archangel(input[0], Integer.valueOf(input[2]), Integer.valueOf(input[3]));
            System.out.println(hero);
        }
    }
}