package org.example.HomeWork13.task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(20);
        numbers.add(58);
        numbers.add(149);
        numbers.add(223);
        numbers.add(18);
        List<String> city = new ArrayList<>();
        city.add("Москва");
        city.add("Воронеж");
        city.add("Ростов");
        city.add("Санкт-Петербург");
        city.add("Курск");
        System.out.println("До выполнения перемещения: " + numbers);
        swap(numbers,0,3);
        System.out.println("После выполнения перемещения: " + numbers);
        System.out.println("-----------------------------------------------");
        System.out.println("До выполнения перемещения: " + city);
        swap(city,0,3);
        System.out.println("После выполнения перемещения: " + city);
    }
    public static <T> void swap (List<T> list, int index1, int index2) {
        try {
            T temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
    }
}
