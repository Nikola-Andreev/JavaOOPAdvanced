package f_reflection.exersise.c_d_e_barracksWars.core.commands;

import f_reflection.exersise.c_d_e_barracksWars.interfaces.Executable;
import f_reflection.exersise.c_d_e_barracksWars.interfaces.Repository;
import f_reflection.exersise.c_d_e_barracksWars.interfaces.UnitFactory;

public abstract class Command implements Executable{

    private String[] data;
    private Repository repository;
    private UnitFactory unitFactory;

    Command(String[] data, Repository repository, UnitFactory unitFactory) {
        this.data = data;
        this.repository = repository;
        this.unitFactory = unitFactory;
    }

    String[] getData() {
        return data;
    }

    Repository getRepository() {
        return repository;
    }

    UnitFactory getUnitFactory() {
        return unitFactory;
    }
}
