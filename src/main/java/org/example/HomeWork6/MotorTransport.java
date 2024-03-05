package org.example.HomeWork6;

public abstract class MotorTransport extends WheeledTransport{
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
   public void service() {
        super.service();
        checkEngine();
    }

    private void checkEngine() {
        System.out.println("Обслуживание двигателя типа:  " + engineType);
    }
}
