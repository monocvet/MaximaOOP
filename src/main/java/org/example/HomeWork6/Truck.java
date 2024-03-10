package org.example.HomeWork6;

public final class Truck extends MotorTransport {
    private Integer capacity;

    public Truck(MotorBuilder motorBuilder, Integer capacity) {
        super(motorBuilder);
        this.capacity = capacity;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
   public void service() {
        super.service();
        checkEngine();
    }
    private void checkEngine() {
        System.out.println("Обслуживание грузовика грузоподъемностью: " + capacity + " тонн.");
    }
    public void doForLoad(){
        System.out.println("Грузовик готов к погрузке.");
    }
}
