package B_Interface.exercises.F_FoodShortage;

public class Citizen extends Human {

    Citizen(String name) {
        super(name);
    }

    @Override
    public void buyFood() {
        super.setFood(super.getFood() + 5);
    }
}