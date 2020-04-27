package org.example;

public class Airbus extends Plane {
    private String model;

    Airbus(int fuelAmount, String model) {
        super(fuelAmount);
        this.model=model;
    }

    @Override
    public void registrationNumber() {
        System.out.println("A123");
    }
}
