package B_Interface.exercises.E_BirthdayCelebrations;

public class Pet implements Identificatable {

    private String birthDate;

    public Pet(String date) {
        this.birthDate = date;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}
