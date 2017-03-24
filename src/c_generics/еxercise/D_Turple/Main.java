package c_generics.еxercise.D_Turple;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String[] input1 = scan.readLine().split("\\s+");
        String[] input2 = scan.readLine().split("\\s+");
        String[] input3 = scan.readLine().split("\\s+");

        Turple turple1 = new Turple(input1[0] + " " + input1[1], input1[2]);
        Turple turple2 = new Turple(input2[0], Integer.valueOf(input2[1]));
        Turple turple3 = new Turple(Integer.valueOf(input3[0]), Double.valueOf(input3[1]));

        System.out.println(turple1);
        System.out.println(turple2);
        System.out.println(turple3);
    }
}
