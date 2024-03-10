package org.example.HomeWork6;

public final class Bicycle extends WheeledTransport{
    private String typeOfBicycle;


    public Bicycle(TransportBuilder transportBuilder, String typeOfBicycle) {
        super(transportBuilder);
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

    public void doForWalk () {
        System.out.println("Велосипед можно использвать для прогулки.");
    }
}
