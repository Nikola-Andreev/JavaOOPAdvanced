package e_enumerationsAndAnotations.lab.b_warningLevels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String level = scan.readLine();
        Logger logger = new Logger(Importance.valueOf(level));

        while (true) {
            String[] input = scan.readLine().split(": ");
            if (input[0].equals("END")) break;
            logger.add(new Message(Importance.valueOf(input[0]), input[1]));
        }

        for (Message message : logger.getMessages()) {
            System.out.println(message);
        }
    }
}
