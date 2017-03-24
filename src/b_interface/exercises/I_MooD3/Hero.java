package b_interface.exercises.I_MooD3;

public abstract class Hero implements IHero{

    private String username;
    private String hashedPassword;
    private int level;

    Hero(String username, int level, String hashedPassword) {
        this.setUsername(username);
        this.setLevel(level);
        this.setHashedPassword(hashedPassword);
    }

    private void setUsername(String username) {
        this.username = username;
    }

    void setHashedPassword(String pass) {
        this.hashedPassword = pass;
    }

    private void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public String getHashedPassword() {
        return this.hashedPassword;
    }

    @Override
    public int getLevel() {
        return this.level;
    }

    @Override
    public String toString() {
        return "\"" + this.getUsername() + "\" | \"" + this.getHashedPassword() + "\" -> "
                + this.getClass().getSimpleName() + System.lineSeparator();
    }
}