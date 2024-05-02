package org.example.HomeWork14.task1;

import java.util.HashMap;

public class PhoneBook {
    private HashMap<String,String> phoneBook = new HashMap<>();

    public void addContact (String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
            System.out.println("Контакт добавлен: " + name + " - " + number);
        } else {
            System.out.println("Контакт уже существует");
        }
    }

    public void findContact (String name) {
        if (phoneBook.containsKey(name)) {
            String phoneNumber = phoneBook.get(name);
            System.out.println("Телефонный номер: " + name + " - " + phoneNumber);
        } else {
            System.out.println("Контакт не найден!");
        }
    }

    public void removeContact (String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            System.out.println("Контакт удален: " + name);
        } else {
            System.out.println("Такого контакта нет.");
        }
    }
}
