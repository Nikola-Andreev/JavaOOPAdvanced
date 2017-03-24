package b_interface.exercises.G_MilitaryElite.interfaces;

import b_interface.exercises.G_MilitaryElite.soldiers.privates.Private;

import java.util.List;

public interface ILeutenanatGeneral extends IPrivate {

    void addPrivate(Private p);

    List<Private> getPrivates();
}
