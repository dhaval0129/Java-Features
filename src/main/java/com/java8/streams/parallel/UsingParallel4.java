/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.parallel;

import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class UsingParallel4 {

    public static void main(String args[]) {
        double start = System.nanoTime();
        long c = IntStream.rangeClosed(0, 1_000_000_000)
                .parallel()
                .filter(i -> i % 2 == 0)
                .count();

        double duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println("Got " + c + " in " + duration + " ms");

        long tot = LongStream.rangeClosed(1, 10)
                .parallel()
                .reduce(1, (a, b) -> a * b);
        System.out.println(tot);

        String s = Stream.of("a", "b", "c", "d", "e")
                .parallel()
                .reduce("", (s1, s2) -> s1 + s2);
        System.out.println(s);
    }
}
