package org.example.HomeWork6;

public abstract class MotorTransport extends WheeledTransport{
    private String engineType;

    public MotorTransport(MotorBuilder motorBuilder) {
        super(motorBuilder);
        this.engineType = motorBuilder.engineType;
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
    public abstract static class MotorBuilder extends TransportBuilder {
        protected String engineType;

        public MotorBuilder() {
        }

        @Override
        public MotorBuilder wheelCount(Integer wheelCount) {
            this.wheelCount = wheelCount;
            return this;
        }

        @Override
        public MotorBuilder maxSpeed(Integer maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public MotorBuilder engineType(String engineType) {
            this.engineType = engineType;
            return this;
        }

        public abstract MotorTransport build();
    }
}
