package org.example.HomeWork15.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Яд бессмертия", 1996));
        books.add(new Book("Ася", 2012));
        books.add(new Book("Долина ужаса", 1915));
        books.add(new Book("Триумфальная арка", 2018));
        books.add(new Book("Знак четырех", 1890));

        List<String> list = books.stream()
                .filter(b -> b.getYear() > 2000)
                .map(Book::getName)
                .toList();

        list.forEach(System.out::println);
    }
}
