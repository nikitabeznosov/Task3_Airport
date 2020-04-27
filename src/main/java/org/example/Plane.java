package org.example;

public abstract class Plane {
    private int fuelAmount; //количество топлива //Применение инкапсуляции
    private Airline airline;
    static int LandedCount=0;

    Plane(int fuelAmount) { //Создание конструктора
        setFuelAmount(fuelAmount);
    }

    int getFuelAmount() { //getter
        return fuelAmount;
    }
    void setFuelAmount(int fuelAmount) { //setter
        this.fuelAmount = fuelAmount;
    }
    public abstract void registrationNumber();

  //  public void fly() {

   // }

}
