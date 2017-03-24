package c_generics.еxercise.E_Threeuple;

public class Turple<E> {

    private E item1;
    private E item2;
    private E item3;

    public Turple(E item1, E item2, E item3) {
        this.item1 = item1;
        this.item2 = item2;
        this.item3 = item3;
    }

    @Override
    public String toString() {
        return this.item1.toString() + " -> " + this.item2.toString() + " -> " + this.item3.toString();
    }
}