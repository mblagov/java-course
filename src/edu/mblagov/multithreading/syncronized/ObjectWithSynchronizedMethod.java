package edu.mblagov.multithreading.syncronized;

public class ObjectWithSynchronizedMethod {

    int counter = 0;

    public void addNextElementSynchronized() {
        synchronized (this) {
            int newVal = counter + 1;
            counter = newVal;
        }
    }

    public void addNextElement() {
        int newVal = counter + 1;
        counter = newVal;
    }

    public int getCounter() {
        return counter;
    }
}
