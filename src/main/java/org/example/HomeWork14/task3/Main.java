package org.example.HomeWork14.task3;

import lombok.extern.java.Log;

import java.util.*;
@Log
public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        log.info("Введите имена (чтобы завершить ввод, наберите stop: ");

       while (true) {
           String input = scanner.next();
           if (input.equalsIgnoreCase("stop")) {
               break;
           }
           names.add(input.toLowerCase());
       }
       scanner.close();

        log.info("Уникальные имена: ");
        for (String name : names) {
            log.info(name);
        }
    }
}
