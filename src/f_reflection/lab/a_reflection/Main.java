package f_reflection.lab.a_reflection;

import f_reflection.lab.Reflection;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {

        Class reflectionClass = Reflection.class;

        System.out.println(reflectionClass);
        System.out.println(reflectionClass.getSuperclass());

        Class[] interfaces = reflectionClass.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        Reflection reflection = (Reflection) reflectionClass.newInstance();
        System.out.println(reflection);
    }
}
