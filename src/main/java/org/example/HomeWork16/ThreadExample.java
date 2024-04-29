package org.example.HomeWork16;

public class ThreadExample extends Thread{
    private StringBuilder sb;

    public ThreadExample(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
    public void run() {
        synchronized (sb) {
            for (int i = 0; i < 100; i++) {
                System.out.print(sb);
            }
            System.out.println();
            char symbol = sb.charAt(0);
            sb.setCharAt(0, ++symbol);
        }

    }
}
