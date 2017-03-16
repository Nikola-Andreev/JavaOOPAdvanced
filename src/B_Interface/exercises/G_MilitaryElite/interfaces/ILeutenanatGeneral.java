package B_Interface.exercises.G_MilitaryElite.interfaces;

import B_Interface.exercises.G_MilitaryElite.soldiers.privates.Private;

import java.util.List;

public interface ILeutenanatGeneral extends IPrivate {

    void addPrivate(Private p);

    List<Private> getPrivates();
}
