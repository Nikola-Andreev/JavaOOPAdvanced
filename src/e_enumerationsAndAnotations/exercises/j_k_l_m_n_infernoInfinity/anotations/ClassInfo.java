package e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.anotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ClassInfo {

    String author() default "";

    String description() default "";

    int revision() default 0;

    String[] reviewers() default "";
}
