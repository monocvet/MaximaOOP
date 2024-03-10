package org.example.HomeWork6;

public abstract class WheeledTransport implements Transport {
    private Integer wheelCount;
    private Integer maxSpeed;

    public WheeledTransport(TransportBuilder transportBuilder) {
        this.wheelCount = transportBuilder.wheelCount;
        this.maxSpeed = transportBuilder.maxSpeed;
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
    public static abstract class TransportBuilder {
        protected Integer wheelCount;
        protected Integer maxSpeed;

        public TransportBuilder() {
        }

        public TransportBuilder wheelCount(Integer wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }
        public TransportBuilder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }
        public abstract WheeledTransport build();
    }
}
