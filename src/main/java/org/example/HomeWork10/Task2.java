package org.example.HomeWork10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Task2 inputException = new Task2();
        inputException.input();            // проверка метода ввода числа.
    }

    public void input() {
        try (Scanner scanner = new Scanner(System.in)) {
            int number = 0;
            while (true) {
                try {
                    System.out.print("Введите число: ");
                    number = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Ошибка, вы ввели не число. Попробуйте снова.");
                    scanner.nextLine();
                }
            }
            int result = number * 2;
            System.out.println("Результат умножения на 2: " + result);
        }
    }
}
