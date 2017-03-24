package b_interface.exercises.F_FoodShortage;

public class Rebel extends Human {

    Rebel(String name) {
        super(name);
    }

    @Override
    public void buyFood() {
        super.setFood(super.getFood() + 10) ;
    }
}