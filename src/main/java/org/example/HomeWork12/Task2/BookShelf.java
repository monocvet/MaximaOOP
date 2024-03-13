package org.example.HomeWork12.Task2;

import java.util.ArrayList;

public class BookShelf {
        private ArrayList<String> books;

        public BookShelf() {
            this.books = new ArrayList<>();
        }

        public void addBook(String bookName) {
            books.add(bookName);
        }
        public void removeBook(String bookName) {
            books.remove(bookName);
        }
        public void listBooks() {
            for (String book: books)
            System.out.print(book + " | ");
            System.out.println();
        }

    }
