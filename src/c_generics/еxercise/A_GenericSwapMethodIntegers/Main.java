package c_generics.еxercise.A_GenericSwapMethodIntegers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            int n = Integer.parseInt(scan.readLine());
            list.add(n);
        }

        String[] input = scan.readLine().split("\\s+");
        int a = list.get(Integer.valueOf(input[0]));
        list.set(Integer.valueOf(input[0]), list.get(Integer.valueOf(input[1])));
        list.set(Integer.valueOf(input[1]), a);

        for (int s : list) {
            System.out.println(new Box<>(s));
        }
    }
}