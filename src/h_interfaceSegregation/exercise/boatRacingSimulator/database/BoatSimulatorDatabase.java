package h_interfaceSegregation.exercise.boatRacingSimulator.database;

import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IBoat;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IEngine;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IRepository;

public class BoatSimulatorDatabase {

    private IRepository<IBoat> boats;
    private IRepository<IEngine> engines;

    @SuppressWarnings("unchecked")
    public BoatSimulatorDatabase() {
        this.boats = new Repository<IBoat>();
        this.engines = new Repository<IEngine>();
    }

    public IRepository<IBoat> getBoats() {
        return this.boats;
    }

    public IRepository<IEngine> getEngines() {
        return this.engines;
    }
}