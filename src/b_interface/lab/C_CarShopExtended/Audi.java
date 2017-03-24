package b_interface.lab.C_CarShopExtended;

public class Audi implements Rentable {

    private Integer minRentPerDay;
    private Double pricePerDay;
    private String model;
    private Integer horsePower;
    private String color;
    private String countryProduced;

    Audi(String model, String color, Integer horsePower, String countryProduced,  Integer minRentPerDay, Double pricePerDay) {
        this.minRentPerDay = minRentPerDay;
        this.pricePerDay = pricePerDay;
        this.model = model;
        this.horsePower = horsePower;
        this.color = color;
        this.countryProduced = countryProduced;
    }

    @Override
    public Integer getMinRentDay() {
        return this.minRentPerDay;
    }

    @Override
    public Double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }

    @Override
    public String toString() {
        return "This is " + this.getModel() + " produced in " + this.countryProduced + " and have " + Car.TIRES + " tires";
    }
}
