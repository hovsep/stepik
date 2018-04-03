package com.hova;

import java.util.function.DoubleUnaryOperator;

public class IntegrateTest {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double r = 0;
        while (a < b) {
            r += f.applyAsDouble(a) * Math.pow(10, -7);
            a += Math.pow(10, -7);
        }
        return r;
    }
}
