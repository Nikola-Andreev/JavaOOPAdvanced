package f_reflection.exersise.c_d_e_barracksWars.core.commands;

import f_reflection.exersise.c_d_e_barracksWars.interfaces.Repository;
import f_reflection.exersise.c_d_e_barracksWars.interfaces.Unit;
import f_reflection.exersise.c_d_e_barracksWars.interfaces.UnitFactory;

public class Add extends Command{

    public Add(String[] data, Repository repository, UnitFactory unitFactory) {
        super(data, repository, unitFactory);
    }

    @Override
    public String execute() throws ReflectiveOperationException {
        String unitType = this.getData()[1];
        Unit unitToAdd = this.getUnitFactory().createUnit(unitType);
        this.getRepository().addUnit(unitToAdd);
        return unitType + " added!";
    }
}
