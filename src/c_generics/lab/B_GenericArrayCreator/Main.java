package c_generics.lab.B_GenericArrayCreator;

public class Main {
    public static void main(String[] args) {

        Object[] strings = ArrayCreator.create(10, "none");
        Integer[] integers = ArrayCreator.create(Integer.class, 5, 1);
        System.out.println(integers.length);
    }
}