package org.example.HomeWork6;

public class MotorTransport extends WheeledTransport{
    private String engineType;

    public MotorTransport(Integer numberOfWheels, Integer maxSpeed, String engineType) {
        super(numberOfWheels, maxSpeed);
        this.engineType = engineType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    @Override
    void service() {
        super.service();
        System.out.println("Обслуживание двигателя типа:  " + engineType);
    }
}
