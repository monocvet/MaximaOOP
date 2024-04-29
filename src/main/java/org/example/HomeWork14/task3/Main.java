package org.example.HomeWork14.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имена (чтобы завершить ввод, наберите stop: ");

       while (true) {
           String input = scanner.next();
           if (input.equalsIgnoreCase("stop")) {
               break;
           }
           names.add(input.toLowerCase());
       }
       scanner.close();

        System.out.println("Уникальные имена: ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
