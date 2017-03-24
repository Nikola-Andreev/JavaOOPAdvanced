package c_generics.lab.A_Jar;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Jar<Pickle> jarOfPickles = new Jar<>();

        jarOfPickles.add(new Pickle());
        jarOfPickles.add(new Pickle());

        Pickle pickle = jarOfPickles.remove();
    }
}
