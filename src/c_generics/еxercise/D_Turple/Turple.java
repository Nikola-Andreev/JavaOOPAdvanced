package c_generics.еxercise.D_Turple;

public class Turple<E> {

    private E item1;
    private E item2;

    public Turple(E item1, E item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    @Override
    public String toString() {
        return this.item1.toString() + " -> " + this.item2.toString();
    }
}
