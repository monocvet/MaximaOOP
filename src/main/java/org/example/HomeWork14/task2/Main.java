package org.example.HomeWork14.task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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

        System.out.print("Результат: ");
        for (Map.Entry<String, Integer> entry : splitWords.entrySet()) {
            System.out.print(entry.getKey() + ": " + entry.getValue() + " ");
        }
    }
}

