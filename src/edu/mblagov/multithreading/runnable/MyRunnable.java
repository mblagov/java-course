package edu.mblagov.multithreading.runnable;

public class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Hello, world from thread " + Thread.currentThread().getName());
    }
}
