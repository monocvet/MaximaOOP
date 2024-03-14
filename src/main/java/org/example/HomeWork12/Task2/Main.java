package org.example.HomeWork12.Task2;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Чистый код");
        bookShelf.addBook("Горе от ума");
        bookShelf.addBook("Война и мир");

        bookShelf.listBooks();

        bookShelf.removeBook("Горе от ума");

        bookShelf.listBooks();
    }
}
