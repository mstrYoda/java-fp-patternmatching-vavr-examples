package com.yoda;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import io.vavr.Tuple3;

public class TupleExamples {
    public void run() {
        Tuple2 tuple2 = Tuple.of(1,2);
        System.out.println(tuple2);

        Tuple3 tuple3 = Tuple.of(1,2,3);
        System.out.println(tuple3._3);
    }
}
