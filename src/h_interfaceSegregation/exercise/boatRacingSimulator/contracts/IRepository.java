package h_interfaceSegregation.exercise.boatRacingSimulator.contracts;

import h_interfaceSegregation.exercise.boatRacingSimulator.exeptions.DuplicateModelException;
import h_interfaceSegregation.exercise.boatRacingSimulator.exeptions.NonExistantModelException;

public interface IRepository<T extends IModelable> {

    void Add(T item) throws DuplicateModelException;

    T GetItem(String model) throws NonExistantModelException;
}
