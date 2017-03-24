package c_generics.еxercise.B_GenericCountMethodDoubles;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(scan.readLine());
        List<Double> list = new ArrayList<>();

        for (int i = 0; i < number; i++) {
            Double num = Double.parseDouble(scan.readLine());
            list.add(num);
        }

        Double target = Double.valueOf(scan.readLine());
        System.out.println(returnCount(list, target));
    }

    private static <T extends Comparable<T>> int returnCount(List<T> list, T element) {
        int count = 0;
        for (T listElement : list) {
            if (listElement.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }
}