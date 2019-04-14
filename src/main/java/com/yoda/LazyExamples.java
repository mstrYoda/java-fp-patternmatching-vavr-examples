package com.yoda;

import io.vavr.Lazy;

public class LazyExamples {
    public void run() {
        Lazy<Double> lazy = Lazy.of(Math::random);
        System.out.println(lazy.isEvaluated());
        System.out.println(lazy.get());
        System.out.println(lazy.isEvaluated());
        System.out.println(lazy.get());

        // real lazy value
        CharSequence chars = Lazy.val(() -> "Yay!", CharSequence.class);
        System.out.println(chars.charAt(0));
    }
}
