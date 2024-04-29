package org.example.HomeWork14.task1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("Ivan", "+79056243897");
        phoneBook.addContact("Dmitriy", "+79817179622");
        phoneBook.addContact("Sergey", "+79298556310");
        phoneBook.addContact("Pavel", "+79132008009");
        phoneBook.addContact("Victor", "+79228151523");

        System.out.println("----------------------------------------");

        phoneBook.findContact("Ivan");
        phoneBook.findContact("Pavel");

        System.out.println("-----------------------------------------");

        phoneBook.removeContact("Ivan");
        phoneBook.findContact("Ivan");
    }
}
