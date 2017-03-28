package f_reflection.exersise.c_d_e_barracksWars.core.commands;

import f_reflection.exersise.c_d_e_barracksWars.interfaces.Repository;
import f_reflection.exersise.c_d_e_barracksWars.interfaces.UnitFactory;

public class Fight extends Command{

    Fight(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ReflectiveOperationException {
        return "fight";
    }
}
