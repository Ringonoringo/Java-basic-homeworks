package ru.nabuhiro.java.basic.homeworks.lesson28.ABC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MonitorWait {

    private static final Object mon = new Object();
    private static volatile char value = 'A';

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(3);
        Runnable printA = () -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (value != 'A') {
                            mon.wait();
                        }
                        System.out.print("A");
                        value = 'B';
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Runnable printB = () -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (value != 'B') {
                            mon.wait();
                        }
                        System.out.print("B");
                        value = 'C';
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        Runnable printC = () -> {
            synchronized (mon) {
                try {
                    for (int i = 0; i < 5; i++) {
                        while (value != 'C') {
                            mon.wait();
                        }
                        System.out.print("C");
                        value = 'A';
                        mon.notifyAll();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        };
        executor.execute(printA);
        executor.execute(printB);
        executor.execute(printC);

        executor.shutdown();
    }
}