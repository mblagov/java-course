package edu.mblagov.multithreading.syncronized;

public class ConcurrentSynchronizedExample {

    public static void main(String[] args) {
        ObjectWithSynchronizedMethod o = new ObjectWithSynchronizedMethod();
        for (int i = 0; i < 1000; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    o.addNextElementSynchronized();
                }
            }).start();
        }

        System.out.println(o.getCounter());
    }

}
