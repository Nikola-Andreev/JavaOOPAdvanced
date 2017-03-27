package e_enumerationsAndAnotations.exercises.c_d_e_f_g_h_cardsWithPower;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CustomInfo {
    String category() default "";
    String description() default "";
    String type() default "Enumeration";
}
