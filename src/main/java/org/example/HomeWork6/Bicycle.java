package org.example.HomeWork6;

public class Bicycle extends WheeledTransport{
    public String typeOfBicycle;


    public Bicycle(Integer numberOfWheels, Integer maxSpeed, String typeOfBicycle) {
        super(numberOfWheels, maxSpeed);
        this.typeOfBicycle = typeOfBicycle;
    }

    public String getTypeOfBicycle() {
        return typeOfBicycle;
    }

    public void setTypeOfBicycle(String typeOfBicycle) {
        this.typeOfBicycle = typeOfBicycle;
    }

    @Override
    void service() {
        super.service();
        System.out.println("Обслужено навесное оборудование велосипеда типа: " + typeOfBicycle);
    }
}
