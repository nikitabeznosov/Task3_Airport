package org.example;

public class Airbus extends Plane {
    private String model;

    Airbus(String FuelAmount, String model) {
        super(FuelAmount);
        this.model=model;
    }

    @Override
    public void RegistrationNumber() {
        System.out.println("A123");
    }
}
