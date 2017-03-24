package d_iteratorsAndComparators.exercises.d_froggy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> numbers = Arrays
                .stream(scan.readLine().split("[ ,]+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        scan.readLine();

        Iterable<Integer> lake = new LakeImpl(numbers);
        StringBuilder stringBuilder = new StringBuilder();

        for (Integer integer : lake) {
            stringBuilder.append(integer).append(", ");
        }
        stringBuilder.setLength(stringBuilder.length() - 2);

        System.out.println(stringBuilder);
    }
}