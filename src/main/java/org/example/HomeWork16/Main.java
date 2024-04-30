package org.example.HomeWork16;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("a");
        Lock lock = new ReentrantLock();

        ThreadExample thread1 = new ThreadExample(stringBuilder, lock);
        ThreadExample thread2 = new ThreadExample(stringBuilder, lock);
        ThreadExample thread3 = new ThreadExample(stringBuilder, lock);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}