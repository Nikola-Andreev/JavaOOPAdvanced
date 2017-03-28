package f_reflection.lab.b_gettersAndSetters;

import f_reflection.lab.Reflection;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

        Class reflectionClass = Reflection.class;

        Arrays.stream(reflectionClass.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("get")).sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.println(method.getName() + " will return " +
                        method.getReturnType()));

        Arrays.stream(reflectionClass.getDeclaredMethods())
                .filter(method -> method.getName().startsWith("set")).sorted(Comparator.comparing(Method::getName))
                .forEach(method -> System.out.println(method.getName() + " and will set field of " +
                        method.getParameterTypes()[0]));
    }
}