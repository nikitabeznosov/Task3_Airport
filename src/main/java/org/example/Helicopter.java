package org.example;

public class Helicopter extends Plane implements VerticalTakeoff {
    Helicopter(int fuelAmount) {
        super(fuelAmount);
    }

    @Override
    public void registrationNumber() {
        System.out.println("H321");
    }

    @Override
    public void takeoff() {
        System.out.println("Vertical take-off possibility");
    }
}
