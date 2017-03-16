package B_Interface.exercises.G_MilitaryElite.interfaces;

import B_Interface.exercises.G_MilitaryElite.missionsAndRepairs.Repair;

import java.util.List;

public interface IEngineer extends ISpecializedSoldier {

    List<Repair> getRepairs();

    public void addRepair(Repair r);
}
