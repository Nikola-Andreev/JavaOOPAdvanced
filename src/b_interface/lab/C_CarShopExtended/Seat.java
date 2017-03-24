package b_interface.lab.C_CarShopExtended;

import java.io.Serializable;

public class Seat implements Car, Sellable, Serializable {

    private Double price;
    private String countryProduced;
    private String color;
    private String model;
    private Integer horsePower;

    Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        this.setCountryProduced(countryProduced);
        this.setColor(color);
        this.setModel(model);
        this.setHorsePower(horsePower);
        this.price = price;
    }

    private String getCountryProduced() {
        return this.countryProduced;
    }

    private void setCountryProduced(String countryProduced) {
        this.countryProduced = countryProduced;
    }

    private void setColor(String color) {
        this.color = color;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
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
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return "This is " + this.getModel() + " produced in " + this.getCountryProduced() + " and have " + Car.TIRES + " tires";
    }

}