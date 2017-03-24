package c_generics.lab.C_GenericScale;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        Scale<String> scale = new Scale<>("Pesho", "Stamat");
        System.out.println(scale.getHeavier());
    }
}
