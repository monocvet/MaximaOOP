package org.example.HomeWork14.task4;

import lombok.extern.java.Log;

import java.util.HashSet;
@Log
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
        log.info("Пересечение множеств: " + intersection);
        log.info("----------------------------------------");

        HashSet<Integer> union = new HashSet<>(numbers1);
        union.addAll(numbers2);
        log.info("Объединение множеств:  " + union);
        log.info("----------------------------------------");

        HashSet<Integer> difference = new HashSet<>(numbers1);
        difference.removeAll(numbers2);
        log.info("Разность первого множества и второго: " + difference);




    }
}
