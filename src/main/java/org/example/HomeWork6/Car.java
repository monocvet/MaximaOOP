package org.example.HomeWork6;

public final class Car extends MotorTransport {
    private String brand;
    private String model;

    public Car(Builder builder) {
        super(builder);
        this.brand = builder.brand;
        this.model = builder.model;
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
    public void service() {
        super.service();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Обслуживание автомобиля марки: " + brand + " Модель: " + model);
    }



    public void doForUse() {
        System.out.println("Легковой автомобиль " + this.model + " готов к эксплуатации.");

    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                "} ";
    }

    public static class Builder extends MotorBuilder {
        protected String brand;
        protected String model;

        public Builder() {
        }

        @Override
        public Builder wheelCount(Integer wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        @Override
        public Builder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        @Override
        public Builder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
