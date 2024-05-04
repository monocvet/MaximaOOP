package org.example.HomeWork15.task1;

import lombok.extern.java.Log;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
@Log
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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

        log.info("Отсортированный список" + filterOfFruits);
    }
}
