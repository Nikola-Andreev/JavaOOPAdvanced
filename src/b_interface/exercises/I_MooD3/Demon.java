package b_interface.exercises.I_MooD3;

public class Demon extends Hero {

    private double energy;

    Demon(String username, double energy, int level) {
        super(username, level, "");
        this.setSpecialPoints(energy);
        this.setHashedPassword((this.getUsername().length() * 217) + "");
    }

    private void setSpecialPoints(double specialPoints) {
        this.energy = specialPoints;
    }

    @Override
    public String toString() {
        return super.toString() + this.energy * this.getLevel();
    }
}
