package org.example.HomeWork16;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");

        ThreadExample thread1 = new ThreadExample(stringBuilder);
        ThreadExample thread2 = new ThreadExample(stringBuilder);
        ThreadExample thread3 = new ThreadExample(stringBuilder);

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
