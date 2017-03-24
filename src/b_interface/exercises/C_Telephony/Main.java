package b_interface.exercises.C_Telephony;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        Smartphone phone = new Smartphone();

        String[] numbers = scan.readLine().split("\\s+");
        String[] urls = scan.readLine().split("\\s+");

        for (String number : numbers) {
            System.out.println(phone.call(number));
        }

        for (String url : urls) {
            System.out.println(phone.browse(url));
        }
    }
}