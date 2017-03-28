package f_reflection.exersise.a_harvestingFields;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String inputCommand = scan.readLine();
            if (inputCommand.equalsIgnoreCase("harvest")) break;

            Class richSolidLandClass = RichSolidLand.class;

            switch (inputCommand) {
                case "private":
                    Arrays.stream(richSolidLandClass.getDeclaredFields()).filter(field -> Modifier.isPrivate(field.getModifiers()))
                            .forEach(field -> System.out.println("private " + field.getType().getSimpleName() + " " + field.getName()));
                    break;
                case "protected":
                    Arrays.stream(richSolidLandClass.getDeclaredFields()).filter(field -> Modifier.isProtected(field.getModifiers()))
                            .forEach(field -> System.out.println("protected " + field.getType().getSimpleName() + " " + field.getName()));
                    break;
                case "public":
                    Arrays.stream(richSolidLandClass.getDeclaredFields()).filter(field -> Modifier.isPublic(field.getModifiers()))
                            .forEach(field -> System.out.println("public " + field.getType().getSimpleName() + " " + field.getName()));
                    break;
                case "all":
                    Arrays.stream(richSolidLandClass.getDeclaredFields())
                            .forEach(field -> System.out.println(convertModifierToString(field.getModifiers())
                                    + " " + field.getType().getSimpleName() + " " + field.getName()));
                    break;
                default:
                    break;
            }
        }
    }

    private static String convertModifierToString(int modifiers) {
        switch (modifiers) {
            case 1:
                return "public";
            case 2:
                return "private";
            case 4:
                return "protected";
            default:
                return "";
        }
    }
}
