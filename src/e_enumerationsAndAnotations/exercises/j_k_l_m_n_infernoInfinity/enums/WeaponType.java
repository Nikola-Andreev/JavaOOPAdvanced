package e_enumerationsAndAnotations.exercises.j_k_l_m_n_infernoInfinity.enums;

public enum WeaponType {

    AXE(5,10,4), SWORD(4,6,3), KNIFE(3,4,2);

    private int minDamage, maxDamage, sockets;

    WeaponType(int minDamage, int maxDamage, int sockets) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.sockets = sockets;
    }

    public int getMinDamage() {
        return this.minDamage;
    }

    public int getMaxDamage() {
        return this.maxDamage;
    }

    public int getSockets() {
        return this.sockets;
    }
}