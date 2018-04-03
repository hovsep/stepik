package com.hova;

public class Test {

    public static void main(String[] args) {

        System.out.println(IntegrateTest.integrate(x -> 1, 0, 10));//10.0
        System.out.println(IntegrateTest.integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(IntegrateTest.integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }
}
