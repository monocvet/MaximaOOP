package org.example.HomeWork15.task3;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 22, 8, 19, 36, 88, 1);

        Integer sum = numbers.stream()
                .reduce(Integer::sum)
                .get();
        System.out.println("Сумма всех чисел: " + sum);
        System.out.println("--------------------------------");

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
        System.out.println("Среднее значение всех чисел: " + average);
        System.out.println("-----------------------------------");

        long countNumbersMoreTen = numbers.stream()
                .filter(n -> n > 10)
                .count();
        System.out.println("Количество цифр больше 10: " + countNumbersMoreTen);

    }
}
