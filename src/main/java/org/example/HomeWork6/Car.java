package org.example.HomeWork6;

public final class Car extends MotorTransport {
    private String brand;
    private String model;

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
    public final void doSomething(){
        System.out.println("Легковой автомобиль " + this.model + " готов к эксплуатации.");
    }
}
