package org.example.HomeWork13.task1;

import org.example.HomeWork13.task1.Book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Чистый код", "Роберт мартин", 2021);
        Book book2 = new Book("Чистый код", "Роберт мартин", 2023);

        if (book1.equals(book2)) {
            System.out.println("Они одинаковые");
        } else {
            System.out.println("Они разные");
        }
        System.out.println(book1);

        //Результат работы задания:
        //Они одинаковые
        //Book:  название: Чистый код', автор: Роберт мартин', год публикации: 2021
    }
}
