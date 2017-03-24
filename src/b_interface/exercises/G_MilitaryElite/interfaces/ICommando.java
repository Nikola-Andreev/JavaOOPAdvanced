package b_interface.exercises.G_MilitaryElite.interfaces;

import b_interface.exercises.G_MilitaryElite.missionsAndRepairs.Mission;

import java.util.List;

public interface ICommando extends ISpecializedSoldier {

    List<Mission> getMissions();

    void addMission(Mission m);
}
