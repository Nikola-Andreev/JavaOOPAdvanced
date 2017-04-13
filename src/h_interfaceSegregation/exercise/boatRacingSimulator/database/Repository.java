package h_interfaceSegregation.exercise.boatRacingSimulator.database;

import h_interfaceSegregation.exercise.boatRacingSimulator.Utility.Constants;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IModelable;
import h_interfaceSegregation.exercise.boatRacingSimulator.contracts.IRepository;
import h_interfaceSegregation.exercise.boatRacingSimulator.exeptions.DuplicateModelException;
import h_interfaceSegregation.exercise.boatRacingSimulator.exeptions.NonExistantModelException;

import java.util.Map;
import java.util.HashMap;

public class Repository<T extends IModelable> implements IRepository {

    private Map<String, IModelable> itemsByModel;

    public Repository()
    {
        this.itemsByModel = new HashMap<>();
    }

    @Override
    public void Add(IModelable item) throws DuplicateModelException {
        if (this.itemsByModel.containsKey(item.getModel())) {
            throw new DuplicateModelException(Constants.DUPLICATE_MODEL_MESSAGE);
        }
        this.itemsByModel.put(item.getModel(), item);
    }

    @Override
    public IModelable GetItem(String model) throws NonExistantModelException {
        if (!this.itemsByModel.containsKey(model)) {
            throw new NonExistantModelException(Constants.NON_EXISTENT_MODEL_MESSAGE);
        }
        return this.itemsByModel.get(model);
    }
}