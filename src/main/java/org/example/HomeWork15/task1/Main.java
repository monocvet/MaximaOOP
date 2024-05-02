package org.example.HomeWork15.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Pear");
        fruits.add("Watermelon");

        List<String> filterOfFruits = fruits.stream()
                .filter(t -> t.length() < 6)
                .sorted(Comparator.reverseOrder())
                .toList();

        filterOfFruits.forEach(System.out::println);
    }
}
