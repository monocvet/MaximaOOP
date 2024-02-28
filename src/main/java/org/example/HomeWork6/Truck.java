package org.example.HomeWork6;

public final class Truck extends MotorTransport {
    private Integer capacity;

    public Truck(Integer numberOfWheels, Integer maxSpeed, String engineType, Integer capacity) {
        super(numberOfWheels, maxSpeed, engineType);
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    void service() {
        super.service();
        System.out.println("Обслуживание грузовика грузоподъемностью: " + capacity + " тонн.");
    }
    public final void doSomething(){
        System.out.println("Грузовик готов к погрузке.");
    }
}
