package c_generics.еxercise.C_CustomList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        CustomList<String> list = new CustomList<>();

        while (true) {
            String[] input = scan.readLine().split("\\s+");
            if (input[0].equals("END")) break;
            switch (input[0]) {
                case "Add":
                    list.add(input[1]);
                    break;
                case "Remove":
                    list.remove(Integer.valueOf(input[1]));
                    break;
                case "Contains":
                    System.out.println(list.contains(input[1]));
                    break;
                case "Swap":
                    list.swap(Integer.valueOf(input[1]), Integer.valueOf(input[2]));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
                case "Greater":
                    System.out.println(list.countGreaterThat(input[1]));
                    break;
                case "Sort":
                    list.sort();
                    break;
            }
        }
    }
}