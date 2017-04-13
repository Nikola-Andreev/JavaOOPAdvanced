package h_interfaceSegregation.exercise.boatRacingSimulator.contracts;

public interface IBoat extends IModelable{

    double CalculateRaceSpeed(IRace race);

    String getBoatType();
}
