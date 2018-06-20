package com.hova;

import java.util.stream.IntStream;

public class Test {


    public static void main(String[] args) {
        IntStream s = pseudoRandomStream(13);

        s.forEach(System.out::println);
    }

    public static IntStream pseudoRandomStream(int seed) {
        IntStream s = IntStream.iterate(seed, n -> {
            Integer nsq = n * n;
            return nsq % 10000 / 10;
        }).limit(seed);

        return s;
    }



}
