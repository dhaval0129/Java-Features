/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.parallel;

import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class UsingParallel3 {

    public static void main(String args[]) {
        boolean isParallel = Stream.of("1").parallel().isParallel();
        System.out.println("isParallel: " + isParallel);

        double start = System.nanoTime();
        Stream.of("b", "d", "a", "c", "e")
                .sorted()
                .filter(s -> {
                    System.out.println("Filter:" + s);
                    return !"d".equals(s);
                })
                .parallel()
                .map(s -> {
                    System.out.println("Map:" + s);
                    return s += s;
                })
                .forEach(System.out::println);
        double duration = (System.nanoTime() - start) / 1_000_000;
        System.out.println(duration + " milliseconds");
    }
}
