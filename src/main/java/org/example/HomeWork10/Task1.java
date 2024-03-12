package org.example.HomeWork10;

public class Task1 {
    public static void main(String[] args) {
        Task1 calculator = new Task1();
        System.out.println(calculator.divide(10, 0));    // проверка метода обработки ошибки деления на 0.
    }

    public static double divide(int firstNum, int secondNum) {  // деление
        double result;
        try {
            result = (double)firstNum / secondNum;
        } catch (ArithmeticException e) {
                System.out.println("Делить на ноль нельзя!");
             return 0;
        } finally {
            System.out.println("Операция деления завершена.");
        }
        return result;
    }
}
