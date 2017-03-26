package e_enumerationsAndAnotations.lab.d_createAnotations;

import java.util.Arrays;

@Subject(categories = {"Main", "Test2"})
public class Main {
    public static void main(String[] args) {
        Class cl = Main.class;
        Subject subject = (Subject) cl.getAnnotation(Subject.class);
        System.out.println(Arrays.toString(subject.categories()));
    }
}
