package org.example.HomeWork6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Transport car1 = new Car(4, 180, "Дизель", "Toyota", "Prius");
        Transport car2 = new Car(4, 140, "Бензин", "Ford", "Kuga");
        Transport bicycle1 = new Bicycle(2, 40, "шоссейный");
        Transport bicycle2 = new Bicycle(2, 50, "горный");
        Transport truck1 = new Truck(6, 140, "Дизель", 8);
        Transport truck2 = new Truck(4, 110, "Бензин", 4);

        Transport[] service = {car1, car2, bicycle1, bicycle2,truck1, truck2};

        ServiceStation serviceStation = new ServiceStation();

        for (Transport transport : service) {
            serviceStation.visitServiceStation(transport);
        }
    }
}
