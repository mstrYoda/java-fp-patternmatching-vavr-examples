package com.yoda;

import io.vavr.control.Try;

import java.io.IOException;

import static io.vavr.API.$;
import static io.vavr.API.Case;
import static io.vavr.API.Match;
import static io.vavr.Predicates.instanceOf;

public class FPTry {
    public void run() {
        Try.of(() -> {
            throw new RuntimeException("runtime exception");
        }).andThen(() -> System.out.println("success"))
                .onFailure((t) -> System.out.println("failure: " + t.getMessage()))
                .andFinally(() -> System.out.println("finally"));
    }

    public void run2() {
        String result = (String) Try.of(() -> {
            throw new RuntimeException();
        })
                .recover(x -> Match(x).of(
                            Case($(instanceOf(RuntimeException.class)), t -> somethingWithException(t)),
                            Case($(instanceOf(IOException.class)), t -> somethingWithException(t))
                        )
                )
                .getOrElse("");
    }

    public String somethingWithException(IOException ex) {
        return "";
    }

    public String somethingWithException(RuntimeException ex) {
        return "";
    }
}
