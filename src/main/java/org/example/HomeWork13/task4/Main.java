package org.example.HomeWork13.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> listOfInteger = new ArrayList<>();
        listOfInteger.add(55);
        listOfInteger.add(96);
        listOfInteger.add(187);
        listOfInteger.add(227);
        System.out.println("Сумма всех чисел типа Integer: " + sumOfList(listOfInteger));

        System.out.println("---------------------------------------------");

        List<Double> listOfDouble = new ArrayList<>();
        listOfDouble.add(55.23);
        listOfDouble.add(115.86);
        listOfDouble.add(17.17);
        listOfDouble.add(339.792);
        System.out.println("Сумма всех чисел типа Double: " + sumOfList(listOfDouble));

    }
    public static double sumOfList (List<? extends Number> list) {
        double addition = 0;
        for (Number number : list) {
            addition += number.doubleValue();
        }
        return addition;
    }
}
