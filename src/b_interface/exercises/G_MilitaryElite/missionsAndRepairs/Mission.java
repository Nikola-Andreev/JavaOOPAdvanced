package b_interface.exercises.G_MilitaryElite.missionsAndRepairs;

import b_interface.exercises.G_MilitaryElite.interfaces.IMission;

public class Mission implements IMission{

    private String codeName;
    private String state;

    public Mission(String codeName, String state) {
        this.setCodeName(codeName);
        this.setState(state);
    }

    @Override
    public String getCodeName() {
        return this.codeName;
    }

    private void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    @Override
    public String getState() {
        return this.state;
    }

    private void setState(String state) {
        if (!state.equals("inProgress") && !state.equals("Finished")) {
            throw new IllegalArgumentException("Invalid state!");
        }
        this.state = state;
    }

    @Override
    public void completeMission() {
        this.state = "Finished";
    }

    @Override
    public String toString() {
        return String.format("  Code Name: %s State: %s\n",this.getCodeName(),this.getState());
    }
}