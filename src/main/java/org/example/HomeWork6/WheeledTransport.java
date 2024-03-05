package org.example.HomeWork6;

public abstract class WheeledTransport implements Transport {
    private Integer wheelCount;
    private Integer maxSpeed;

    public WheeledTransport(Integer numberOfWheels, Integer maxSpeed) {
        this.wheelCount = numberOfWheels;
        this.maxSpeed = maxSpeed;
    }

    public Integer getWheelCount() {
        return wheelCount;
    }

    public void setWheelCount(Integer wheelCount) {
        this.wheelCount = wheelCount;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void service() {
        System.out.println("Обслужено колёс - " + wheelCount);
    }
}
