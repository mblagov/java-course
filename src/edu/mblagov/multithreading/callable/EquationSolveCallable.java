package edu.mblagov.multithreading.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class EquationSolveCallable implements Callable<List<Double>> {

    private Double a;
    private Double b;
    private Double c;

    public EquationSolveCallable(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public List<Double> call() throws Exception {
        List<Double> result = new ArrayList<>();
        double d = b * b - 4 * a * c;
        if (d > 0) {
            result.add(-b + Math.sqrt(d) / (2 * a));
            result.add(-b - Math.sqrt(d) / (2 * a));
        } else if (d == 0) {
            result.add(-b / (2 * a));
        }

        return result;
    }
}
