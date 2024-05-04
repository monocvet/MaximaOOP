package org.example.HomeWork14.task2;

import lombok.extern.java.Log;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
@Log
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        Map<String, Integer> splitWords = new HashMap<>();


        for (String word : words) {
                splitWords.put(word, splitWords.containsKey(word) ? splitWords.get(word) + 1 : 1);
            }

        log.info("Результат: ");
        for (Map.Entry<String, Integer> entry : splitWords.entrySet()) {
            log.info(entry.getKey() + ": " + entry.getValue() + " ");
        }
    }
}

