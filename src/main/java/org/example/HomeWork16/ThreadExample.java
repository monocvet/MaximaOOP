package org.example.HomeWork16;

import lombok.extern.java.Log;

import java.util.concurrent.locks.Lock;
@Log
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
        try {
            for (int i = 0; i < 100; i++) {
                log.info("Поток" + i + " = " + sb);
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

