package org.example.HomeWork6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип транспорта: ");
        String type = scanner.nextLine();
        System.out.println(type);

        WheeledTransport wheeledTransport = null;
        if (type.equalsIgnoreCase("car")) {
            wheeledTransport = new Car(4, 180, "Дизель", "Toyota", "Prius");
        } else if (type.equalsIgnoreCase("bicycle")) {
            wheeledTransport = new Bicycle(2, 40, "шоссейный");
        } else if (type.equalsIgnoreCase("truck")) {
            wheeledTransport = new Truck(6, 140, "Дизель", 8);
        } else {
            System.out.println("Такого транспорта нет");
            return;
        }

        visitServiceStation(wheeledTransport);
    }

    static WheeledTransport visitServiceStation(WheeledTransport transport) {
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
