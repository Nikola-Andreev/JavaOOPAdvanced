package e_enumerationsAndAnotations.lab.d_createAnotations;

import java.util.Arrays;

@Subject(categories = {"f_reflection.lab.a_reflection.f_reflection.lab.b_gettersAndSetters.f_reflection.lab.c_highQualityMistakes.Main", "Test2"})
public class Main {
    public static void main(String[] args) {
        Class cl = Main.class;
        Subject subject = (Subject) cl.getAnnotation(Subject.class);
        System.out.println(Arrays.toString(subject.categories()));
    }
}
