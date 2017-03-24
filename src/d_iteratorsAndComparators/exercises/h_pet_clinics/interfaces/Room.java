package d_iteratorsAndComparators.exercises.h_pet_clinics.interfaces;

import d_iteratorsAndComparators.exercises.h_pet_clinics.Pet;

public interface Room {

    void addPet(Pet p);

    boolean isEmpty();

    void release();
}
