package d_iteratorsAndComparators.exercises.h_pet_clinics;

import d_iteratorsAndComparators.exercises.h_pet_clinics.interfaces.Clinic;
import d_iteratorsAndComparators.exercises.h_pet_clinics.interfaces.Room;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClinicImpl implements Clinic, Iterable{

    private int numberOfRooms;
    private String name;
    private List<RoomImpl> rooms;

    public ClinicImpl(String name, int numberOfRooms) {
        this.setNumberOfRooms(numberOfRooms);
        this.setRooms(numberOfRooms);
        this.name = name;
    }

    private void setNumberOfRooms(int numberOfRooms) {
        if (numberOfRooms % 2 == 0) {
            throw new IllegalArgumentException("Invalid Operation!");
        }
        this.numberOfRooms = numberOfRooms;
    }

    private void setRooms(int capacity) {
        this.rooms = new ArrayList<>(capacity);
        for (int i = 0; i < this.numberOfRooms; i++) {
            this.rooms.add(i, new RoomImpl());
        }
    }

    @Override
    public boolean addPet(Pet p) {
        for (Object o : this) {
            Room r = (Room) o;
            if (r.isEmpty()) {
                r.addPet(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasEmptyRooms() {
        for (RoomImpl room : rooms) {
            if (room.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String print() {
        StringBuilder result = new StringBuilder();
        for (RoomImpl room : this.rooms) {
            result.append(room).append(System.lineSeparator());
        }
        return result.toString().trim();
    }

    @Override
    public String print(int indexRoom) {
        return this.rooms.get(indexRoom - 1).toString();
    }

    @Override
    public boolean release() {
        int startIndex = numberOfRooms == 1 ? 0 : numberOfRooms / 2;


        for (int i = startIndex; i < this.rooms.size(); i++) {
            Room currentRoom = this.rooms.get(i);
            if (!currentRoom.isEmpty()) {
                currentRoom.release();
                return true;
            }
        }

        for (int i = 0; i < startIndex; i++) {
            Room currentRoom = this.rooms.get(i);
            if (!currentRoom.isEmpty()) {
                currentRoom.release();
                return true;
            }
        }

        return false;
    }

    @Override
    public Iterator iterator() {
        return new ClinicIterator();
    }

    private final class ClinicIterator implements Iterator{

        private int index;
        private boolean minus;
        private int counter;

        private ClinicIterator() {
            this.index = numberOfRooms == 1 ? 0 : numberOfRooms / 2;
            this.minus = false;
            this.counter = 0;
        }

        @Override
        public boolean hasNext() {
            return this.counter < rooms.size();
        }

        @Override
        public RoomImpl next() {
            int currentIndex = this.index;
            if (this.minus) {
                this.minus = false;
                this.index -= this.counter;
                return rooms.get(currentIndex  - this.counter++);
            } else {
                this.minus = true;
                this.index += this.counter;
                return rooms.get(currentIndex  + this.counter++);
            }
        }
    }
}