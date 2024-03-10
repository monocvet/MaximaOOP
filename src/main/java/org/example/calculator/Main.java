package org.example.calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("Результат от умножения: " + calculator.multiply(23, 18));
        System.out.println("Результат от вычитания: " + calculator.subtract(23, 18));
        System.out.println("Результат от деления: " + calculator.divide(23, 18));
        System.out.println("Результат от деления на ноль: " + calculator.divide(23, 0));

        System.out.println("Результат от сложения двух чисел: " + calculator.addition(23, 18));
        int[] array = {5, 18, 22, 89, 97};
        System.out.println("Результат от сложения чисел массива: " + calculator.addition(array));
        System.out.println("Результат от сложения нескольких чисел: " + calculator.addition(23, 18, 85, 77, 14));
    }
}
