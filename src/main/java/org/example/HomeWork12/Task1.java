package org.example.HomeWork12;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();  // список фруктов
        fruit.add("яблоко");
        fruit.add("груша");
        fruit.add("апельсин");
        fruit.add("банан");
        fruit.add("дыня");

        List<String> vegetables = new ArrayList<>(); // список овощей
        vegetables.add("помидор");
        vegetables.add("тыква");
        vegetables.add("морковь");
        vegetables.add("капуста");
        vegetables.add("кукуруза");

        LinkedList<String> allPlants = new LinkedList<>();
        allPlants.addAll(fruit);                      // добавление в LinkedList фруктов
        allPlants.addAll(vegetables);                 // добавление в LinkedList овощей
        System.out.println(allPlants.containsAll(fruit));
        System.out.println(allPlants.containsAll(vegetables));

        allPlants.removeAll(vegetables);
        System.out.println(allPlants);

    }
}
