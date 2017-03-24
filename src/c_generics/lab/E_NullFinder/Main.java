package c_generics.lab.E_NullFinder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(null);
        list.add(null);
        list.add(7);
        System.out.println(ListUtils.getNullIndices(list));
    }
}