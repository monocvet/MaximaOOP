package org.example.HomeWork6;

public class ServiceStation {
   public Transport visitServiceStation(Transport transport) {
        transport.service();
        if (transport instanceof Car) {
            Car toyota = (Car) transport;
            toyota.doForUse();
        } else if (transport instanceof Bicycle) {
            Bicycle bicycle = (Bicycle) transport;
            bicycle.doForWalk();
        } else if (transport instanceof Truck) {
            Truck truck = (Truck) transport;
            truck.doForLoad();
        }
        return transport;
    }
}
