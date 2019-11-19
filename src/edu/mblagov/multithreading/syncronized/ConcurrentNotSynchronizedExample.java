package edu.mblagov.multithreading.syncronized;

public class ConcurrentNotSynchronizedExample {

    public static void main(String[] args) {
        ObjectWithSynchronizedMethod o = new ObjectWithSynchronizedMethod();
        for (int i = 0; i < 1000; i++) {
            new Thread(o::addNextElement).start();
        }

        System.out.println(o.getCounter());
    }
}
