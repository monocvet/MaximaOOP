package org.example.HomeWork16;

import java.util.concurrent.locks.Lock;

public class ThreadExample extends Thread {
    private StringBuilder sb;
    private Lock lock;

    public ThreadExample(StringBuilder sb, Lock lock) {
        this.sb = sb;
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        for (int i = 0; i < 100; i++) {
            System.out.print(sb);
        }
        System.out.println();
        char symbol = sb.charAt(0);
        sb.setCharAt(0, ++symbol);
        lock.unlock();
    }
}

