package org.example.HomeWork6;

public class Main {
    public static void main(String[] args) {
        WheeledTransport bicycle = new Bicycle(2,40,"шоссейный");
        visitServiceStation(bicycle);
        WheeledTransport car = new Car(4,180,"Дизель", "Toyota","Prius");
        visitServiceStation(car);
        WheeledTransport truck = new Truck(6,140,"Дизель",8);
        visitServiceStation(truck);

    }
    static WheeledTransport visitServiceStation(WheeledTransport transport) {
        transport.service();
        return transport;
    }
}
