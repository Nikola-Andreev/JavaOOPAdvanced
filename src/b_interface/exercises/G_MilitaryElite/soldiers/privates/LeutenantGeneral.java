package b_interface.exercises.G_MilitaryElite.soldiers.privates;


import b_interface.exercises.G_MilitaryElite.interfaces.ILeutenanatGeneral;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeutenantGeneral extends Private implements ILeutenanatGeneral{

    private List<Private> privates;

    public LeutenantGeneral(int id, String firstName, String lastName, Double salary) {
        super(id, firstName, lastName, salary);
        this.privates = new ArrayList<>();
    }

    @Override
    public void addPrivate(Private p) {
        privates.add(p);
    }

    @Override
    public List<Private> getPrivates() {
        return Collections.unmodifiableList(this.privates);
    }

    @Override
    public String toString() {
        StringBuilder privatesToString = new StringBuilder();
        this.privates.forEach(p -> privatesToString.append("  ").append(p.toString()));
        return super.toString() + "Privates:\n" + privatesToString;
    }
}