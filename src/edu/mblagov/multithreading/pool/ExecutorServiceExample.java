package edu.mblagov.multithreading.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = null;
        try {
            executorService = Executors.newFixedThreadPool(2);
            for (int i = 0; i < 10; i++) {
                executorService.execute(() -> {
                    System.out.println(String.format("starting expensive task thread %s",
                            Thread.currentThread().getName()));
                    //doSomethingExpensive();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(String.format("expensive task thread %s ended",
                            Thread.currentThread().getName()));

                });
            }
        } finally {
            executorService.shutdown();
        }
    }
}
