package org.example.HomeWork14.task4;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> numbers1 = new HashSet<>();
        for (int i = 1; i <= 10; i++) {
            numbers1.add(i);
        }
        HashSet<Integer> numbers2 = new HashSet<>();
        for (int i = 5; i <= 15; i++) {
            numbers2.add(i);
        }

        HashSet<Integer> intersection = new HashSet<>(numbers1);
        intersection.retainAll(numbers2);
        System.out.println("Пересечение множеств: " + intersection);
        System.out.println("----------------------------------------");

        HashSet<Integer> union = new HashSet<>(numbers1);
        union.addAll(numbers2);
        System.out.println("Объединение множеств:  " + union);
        System.out.println("----------------------------------------");

        HashSet<Integer> difference = new HashSet<>(numbers1);
        difference.removeAll(numbers2);
        System.out.println("Разность первого множества и второго: " + difference);




    }
}
