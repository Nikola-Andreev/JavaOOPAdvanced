package h_interfaceSegregation.exercise.boatRacingSimulator.contracts;

import h_interfaceSegregation.exercise.boatRacingSimulator.exeptions.*;

import java.util.List;

public interface ICommandHandler {
    String ExecuteCommand(String name, List<String> parameters)
            throws DuplicateModelException, NonExistantModelException, RaceAlreadyExistsException,
            NoSetRaceException, InsufficientContestantsException;
}
