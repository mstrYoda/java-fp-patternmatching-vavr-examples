package com.yoda;

import io.vavr.Function1;

public class MethodMemoization {
    public void run() {
        Function1 memoizedFunc = Function1.of(MethodMemoization::square).memoized();

        memoizedFunc.apply(5);
        // the second function call is not printed because of memoization
        memoizedFunc.apply(5);
    }

    public static int square(int num) {
        System.out.println("factorial calculated for : " + num);
        return num * num;
    }
}
