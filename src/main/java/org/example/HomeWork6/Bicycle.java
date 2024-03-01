package org.example.HomeWork6;

public final class Bicycle extends WheeledTransport{
    private String typeOfBicycle;


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
    public void service() {
        super.service();
        checkEngine();
    }
    private void checkEngine() {
        System.out.println("Обслужено навесное оборудование велосипеда типа: " + typeOfBicycle);
    }

    public final void doForWalk () {
        System.out.println("Велосипед можно использвать для прогулки.");
    }
}
