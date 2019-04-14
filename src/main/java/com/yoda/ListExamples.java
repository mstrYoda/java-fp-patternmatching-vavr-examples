package com.yoda;

import io.vavr.collection.List;

public class ListExamples {
    public void run() {

        // intersperse & foldLeft
        String stringWithComma = List.of("1","2","3")
                .intersperse(",")
                .foldLeft(new StringBuilder(), StringBuilder::append)
                .toString();

        System.out.println(stringWithComma);


        List vavrList = List.of("1","2","3");


        // java list
        java.util.List<String> javaList = vavrList.asJava();


        // combinations
        System.out.println(vavrList.combinations());
    }
}
