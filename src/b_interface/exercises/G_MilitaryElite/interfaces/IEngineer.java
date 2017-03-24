package b_interface.exercises.G_MilitaryElite.interfaces;

import b_interface.exercises.G_MilitaryElite.missionsAndRepairs.Repair;

import java.util.List;

public interface IEngineer extends ISpecializedSoldier {

    List<Repair> getRepairs();

    public void addRepair(Repair r);
}
