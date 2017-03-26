package e_enumerationsAndAnotations.lab.c_coffeeMachine;

public class Coffee {

    private CoffeeSize size;
    private CoffeeType type;

    public Coffee(CoffeeSize size, CoffeeType type) {
        this.size = size;
        this.type = type;
    }

    public int getPrice() {
        return this.size.getPrice();
    }

    public CoffeeSize getSize() {
        return this.size;
    }

    public CoffeeType getType() {
        return this.type;
    }

    @Override
    public String toString() {
        return this.size + " " + this.type;
    }
}