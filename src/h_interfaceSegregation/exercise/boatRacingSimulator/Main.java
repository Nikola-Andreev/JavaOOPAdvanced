package h_interfaceSegregation.exercise.boatRacingSimulator;

import h_interfaceSegregation.exercise.boatRacingSimulator.Core.CommandHandler;
import h_interfaceSegregation.exercise.boatRacingSimulator.Core.Engine;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IBoatSimulatorController;
import h_interfaceSegregation.exercise.boatRacingSimulator.controllers.BoatSimulatorController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        IBoatSimulatorController ctrl = new BoatSimulatorController();
        CommandHandler commandHandler = new CommandHandler(ctrl);
        Engine engine = new Engine(commandHandler);
        engine.Run();
    }
}