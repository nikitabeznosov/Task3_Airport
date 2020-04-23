package org.example;

public abstract class Plane {
    private String FuelAmount; //количество топлива //Применение инкапсуляции
    private Airline airline;
    static int LandedCount=0;

    Plane(String FuelAmount) { //Создание конструктора
        setFuelAmount(FuelAmount);
    }

    String getFuelAmount() {
        return FuelAmount;
    }
    void setFuelAmount(String FuelAmount) {
        this.FuelAmount = FuelAmount;
    }
    public abstract void RegistrationNumber();

  //  public void fly() {

   // }

}
