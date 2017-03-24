package b_interface.exercises.G_MilitaryElite.soldiers.privates.specializedSoldier;

import b_interface.exercises.G_MilitaryElite.interfaces.IEngineer;
import b_interface.exercises.G_MilitaryElite.missionsAndRepairs.Repair;

import java.util.*;

public class Engineer extends SpecialisedSoldier implements IEngineer {

    private List<Repair> repairs;

    public Engineer(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        this.repairs = new ArrayList<>();
    }

    @Override
    public List<Repair> getRepairs() {
        return Collections.unmodifiableList(this.repairs);
    }

    @Override
    public void addRepair(Repair r) {
        this.repairs.add(r);
    }

    @Override
    public String toString() {
        StringBuilder repairsToString = new StringBuilder();
        repairsToString.append("Repairs:\n");
        this.repairs.forEach(repairsToString::append);
        return super.toString() + repairsToString;
    }
}