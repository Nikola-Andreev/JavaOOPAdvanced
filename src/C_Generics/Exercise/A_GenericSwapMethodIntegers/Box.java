package C_Generics.Exercise.A_GenericSwapMethodIntegers;

public class Box<E> {

    private E field;

    public Box(E field) {
        this.field = field;
    }

    @Override
    public String toString() {
        return this.field.getClass().getCanonicalName() + ": " + this.field;
    }
}
