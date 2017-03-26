package e_enumerationsAndAnotations.lab.c_coffeeMachine;

public enum CoffeeType {

    ESPRESSO, LATTE, IRISH;

    @Override
    public String toString() {
        return this.name().charAt(0) + this.name().substring(1).toLowerCase();
    }
}
