package f_reflection.exersise.b_blackBoxInteger;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        // make magic
        Class blackBoxClass = BlackBoxInt.class;
        Constructor constructor = blackBoxClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        BlackBoxInt blackBoxInt = (BlackBoxInt) constructor.newInstance();

        while (true) {
            //read input
            String[] input = scan.readLine().split("_");
            if (input[0].equalsIgnoreCase("end")) break;
            // invoke method
            Method method = blackBoxClass.getDeclaredMethod(input[0], int.class);
            method.setAccessible(true);
            method.invoke(blackBoxInt, Integer.valueOf(input[1]));
            // get and print field value
            Field field = blackBoxClass.getDeclaredField("innerValue");
            field.setAccessible(true);
            System.out.println(field.get(blackBoxInt));
        }
    }
}