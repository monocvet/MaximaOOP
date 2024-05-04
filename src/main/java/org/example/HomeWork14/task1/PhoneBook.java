package org.example.HomeWork14.task1;

import lombok.extern.java.Log;

import java.util.HashMap;
@Log
public class PhoneBook {
    private HashMap<String,String> phoneBook = new HashMap<>();

    public void addContact (String name, String number) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, number);
            log.info("Контакт добавлен: " + name + " - " + number);
        } else {
            log.info("Контакт уже существует");
        }
    }

    public void findContact (String name) {
        if (phoneBook.containsKey(name)) {
            String phoneNumber = phoneBook.get(name);
            log.info("Телефонный номер: " + name + " - " + phoneNumber);
        } else {
            log.info("Контакт не найден!");
        }
    }

    public void removeContact (String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            log.info("Контакт удален: " + name);
        } else {
            log.info("Такого контакта нет.");
        }
    }
}
