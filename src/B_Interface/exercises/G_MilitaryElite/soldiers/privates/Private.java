package B_Interface.exercises.G_MilitaryElite.soldiers.privates;

import B_Interface.exercises.G_MilitaryElite.interfaces.IPrivate;
import B_Interface.exercises.G_MilitaryElite.soldiers.Soldier;

public class Private extends Soldier implements IPrivate{

    private Double salary;

    public Private(int id, String firstName, String lastName, double salary) {
        super(id, firstName, lastName);
        this.setSalary(salary);
    }

    private void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Salary: %.2f\n", this.getSalary());
    }
}