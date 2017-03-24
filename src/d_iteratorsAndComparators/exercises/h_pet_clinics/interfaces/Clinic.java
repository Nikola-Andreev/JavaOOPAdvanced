package d_iteratorsAndComparators.exercises.h_pet_clinics.interfaces;

import d_iteratorsAndComparators.exercises.h_pet_clinics.Pet;

public interface Clinic {

    boolean addPet(Pet p);

    boolean hasEmptyRooms();

    String print();

    String print(int indexRoom);

    boolean release();
}
