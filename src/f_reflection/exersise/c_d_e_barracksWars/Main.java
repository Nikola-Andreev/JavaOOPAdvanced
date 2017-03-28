package f_reflection.exersise.c_d_e_barracksWars;

import f_reflection.exersise.c_d_e_barracksWars.core.Engine;
import f_reflection.exersise.c_d_e_barracksWars.core.factories.UnitFactoryImpl;
import f_reflection.exersise.c_d_e_barracksWars.data.UnitRepository;
import f_reflection.exersise.c_d_e_barracksWars.interfaces.Repository;
import f_reflection.exersise.c_d_e_barracksWars.interfaces.UnitFactory;

public class Main {
    public static void main(String[] args) {

        Repository repository = new UnitRepository();
        UnitFactory unitFactory = new UnitFactoryImpl();
        Runnable engine = new Engine(repository, unitFactory);
        engine.run();
    }
}
