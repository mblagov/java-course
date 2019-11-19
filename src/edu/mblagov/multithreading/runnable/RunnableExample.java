package edu.mblagov.multithreading.runnable;

public class RunnableExample {

    public static void main(String[] args) {
        Thread t = new Thread(null,
                new MyRunnable(),
                "MyName");
        t.start();

        Thread t1 = new Thread(new MyRunnable());
        t1.start();
    }
}
