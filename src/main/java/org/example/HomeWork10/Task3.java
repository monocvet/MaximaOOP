package org.example.HomeWork10;

public class Task3 {
    public static void main(String[] args) {
        try {
            findUserById(5);    // Поиск пользователя с номером 5
            findUserById(-2);  // Поиск пользователя с номером -2
        } catch (UserNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findUserById(int userId) throws UserNotFoundException {
        if (userId < 0) {
            throw new UserNotFoundException("Пользователь не найден!");
        } else {
            System.out.println("Id пользователя: " + userId);
        }
    }
}
