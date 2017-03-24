package b_interface.exercises.F_FoodShortage;

public abstract class Human implements Buyer {
    private String name;
    private int food;

    Human(String name) {
        this.name = name;
        this.food = 0;
    }

    public String getName() {
        return this.name;
    }

    public int getFood() {
        return this.food;
    }

    void setFood(int food) {
        this.food = food;
    }
}