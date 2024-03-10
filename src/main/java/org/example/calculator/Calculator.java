package org.example.calculator;

public class Calculator {
    public int multiply(int firstNum, int secondNum) {  // умножение
        return firstNum * secondNum;
    }

    public double divide(int firstNum, int secondNum) {  // деление
        if (secondNum == 0) {
            System.out.print("Делить на ноль нельзя! ");
            return 0;
        }
        return (double) firstNum / secondNum;
    }

    public int subtract(int firstNum, int secondNum) {  // вычитание
        return firstNum - secondNum;
    }

    public int addition(int firstNum, int secondNum) {  // сложение
        return firstNum + secondNum;
    }

    public int addition(int[] nums) {  // сложение
        int result = 0;
        for (int num : nums)
            result += num;
        return result;
    }
    public int addition(int firstNum, int... otherNums) {  // сложение
        int result = firstNum;
        for (int num: otherNums)
            result += num;
        return result;
    }
}
