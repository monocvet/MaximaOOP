package org.example.HomeWork16;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadExample extends Thread {
    private StringBuilder sb;
    private Lock lock = new ReentrantLock();

    public ThreadExample(StringBuilder sb, Lock lock) {
        this.sb = sb;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            for (int i = 0; i < 100; i++) {
                System.out.print(sb);
            }
            System.out.println();
            char symbol = sb.charAt(0);
            sb.setCharAt(0, ++symbol);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }

    }
}

