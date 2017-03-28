package f_reflection.exersise.c_d_e_barracksWars.core.factories;

import f_reflection.exersise.c_d_e_barracksWars.interfaces.Unit;
import f_reflection.exersise.c_d_e_barracksWars.interfaces.UnitFactory;
import f_reflection.exersise.c_d_e_barracksWars.models.units.AbstractUnit;

import java.lang.reflect.Constructor;

public class UnitFactoryImpl implements UnitFactory {

    private static final String UNITS_PACKAGE_NAME = "f_reflection.exersise.c_d_e_barracksWars.models.units.";

    @Override
    @SuppressWarnings("unchecked")
    public Unit createUnit(String unitType) throws ReflectiveOperationException {

        Class currentClass = Class.forName(UNITS_PACKAGE_NAME + unitType);
        Constructor<AbstractUnit> constructor = currentClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        return  constructor.newInstance();

    }
}