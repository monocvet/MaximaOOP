package org.example.HomeWork6;

public class Car extends MotorTransport{
    String brand;
    String model;

    public Car(Integer numberOfWheels, Integer maxSpeed, String engineType, String brand, String model) {
        super(numberOfWheels, maxSpeed, engineType);
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void service() {
        super.service();
        System.out.println("Обслуживание автомобиля марки: " + brand + " Модель: " + model);
    }
}
