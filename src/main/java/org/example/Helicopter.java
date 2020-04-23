package org.example;

public class Helicopter extends Plane implements VerticalTakeoff {
    Helicopter(String FuelAmount) {
        super(FuelAmount);
    }

    @Override
    public void RegistrationNumber() {
        System.out.println("H321");
    }

    @Override
    public void takeoff() {
        System.out.println("Vertical take-off possibility");
    }
}
