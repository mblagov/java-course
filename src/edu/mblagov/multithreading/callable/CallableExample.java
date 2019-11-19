package edu.mblagov.multithreading.callable;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableExample {

    public static void main(String[] args)
            throws ExecutionException, InterruptedException {
        FutureTask<List<Double>> f = new FutureTask<>(
                new EquationSolveCallable(1d, 2d, 1d)
        );
        Thread t = new Thread(f);
        t.start();

        List<Double> roots = f.get();
        System.out.println(roots);
    }
}
