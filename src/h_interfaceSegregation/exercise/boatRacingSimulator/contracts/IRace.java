package h_interfaceSegregation.exercise.boatRacingSimulator.contracts;


import h_interfaceSegregation.exercise.boatRacingSimulator.exeptions.DuplicateModelException;

import java.util.List;

public interface IRace
{
    int getDistance();

    int getWindSpeed();

    int getOceanCurrentSpeed();

    Boolean getAllowsMotorboats();

    void AddParticipant(IBoat boat) throws DuplicateModelException;

    List<IBoat> GetParticipants();
}
