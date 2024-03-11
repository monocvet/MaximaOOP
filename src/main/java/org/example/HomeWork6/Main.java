package org.example.HomeWork6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();
        Car car1 = new Car.Builder()
                .wheelCount(4)
                .maxSpeed(180)
                .engineType("gasoline")
                .brand("KIA")
                .model("RIO")
                .build();
        System.out.println(serviceStation.visitServiceStation(car1));

        }
    }

