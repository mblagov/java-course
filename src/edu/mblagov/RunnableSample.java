package edu.mblagov;

public class RunnableSample {

    public static void main(String[] args) {

        java.lang.Runnable myRunnable = new java.lang.Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, world!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        for (int i = 1; i <= 10000; i++) {
            Thread t = new Thread(myRunnable);
            t.start();
        }
        int a = 15;
        if (a == 10)
            System.out.println("Do something");
            a++;


//        Thread.sleep(1000);
    }
}
