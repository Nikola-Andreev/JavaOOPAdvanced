package b_interface.exercises.G_MilitaryElite.soldiers.privates.specializedSoldier;

import b_interface.exercises.G_MilitaryElite.interfaces.ICommando;
import b_interface.exercises.G_MilitaryElite.missionsAndRepairs.Mission;

import java.util.*;

public class Commando extends SpecialisedSoldier implements ICommando {

    private List<Mission> missions;

    public Commando(int id, String firstName, String lastName, double salary, String corps) {
        super(id, firstName, lastName, salary, corps);
        missions = new ArrayList<>();
    }

    @Override
    public List<Mission> getMissions() {
        return Collections.unmodifiableList(this.missions);
    }

    @Override
    public void addMission(Mission m) {
        this.missions.add(m);
    }

    @Override
    public String toString() {
        StringBuilder missionsToString = new StringBuilder();
        missionsToString.append("Missions:\n");
        this.missions.forEach(missionsToString::append);
        return super.toString() + missionsToString;
    }
}