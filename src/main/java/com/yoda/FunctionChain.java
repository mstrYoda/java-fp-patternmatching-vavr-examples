package com.yoda;

import io.vavr.Function3;

public class FunctionChain {
    public void run() {
        Function3 calculationMethodFunction = Function3.of(FunctionChain::calculationMethod);

        calculationMethodFunction.andThen(x -> {
            System.out.println("first result: " + x);
            return 2 * (int)x;
        }).andThen(x -> {
            System.out.println("second result: " + x);
            return x;
        }).apply(1,2,3);
    }

    public static int calculationMethod(int a, int b, int c) {
        System.out.println("calculation method called");
        return a + b + c;
    }
}
