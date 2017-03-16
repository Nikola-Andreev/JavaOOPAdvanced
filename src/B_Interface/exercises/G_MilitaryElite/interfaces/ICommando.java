package B_Interface.exercises.G_MilitaryElite.interfaces;

import B_Interface.exercises.G_MilitaryElite.missionsAndRepairs.Mission;

import java.util.List;

public interface ICommando extends ISpecializedSoldier {

    List<Mission> getMissions();

    void addMission(Mission m);
}
