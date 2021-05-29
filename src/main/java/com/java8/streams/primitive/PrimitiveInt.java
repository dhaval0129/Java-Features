/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.primitive;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class PrimitiveInt {

    public static void main(String args[]) {
        int sum1 = IntStream.of(10, 20, 30, 40).sum();

        int sum2 = IntStream.of(10, 20, 30, 40)
                .reduce(0, ((sum, val) -> sum + val));

        System.out.println(sum1 + " " + sum2);

        System.out.println("\nStream Iterate example by making it finite stream");
        IntStream count = IntStream.iterate(1, n -> n + 1).limit(5);
        count.forEach(System.out::println);

        System.out.println("\nRange & Range Closed Example");
        IntStream range1 = IntStream.range(1, 6);
        range1.forEach(System.out::println);

        IntStream range2 = IntStream.rangeClosed(1, 5);
        range2.forEach(System.out::println);

        System.out.println("Factorial example using range");
        // factorial of 5
        OptionalInt range = IntStream.rangeClosed(1, 5).reduce((x, y) -> (x * y));
        System.out.println(range.getAsInt());
        
        System.out.println("Stream Map example conversion from object to int stream");
        Stream<String> objStream = Stream.of("penguin", "fish");
        IntStream intStream = objStream.mapToInt(s -> s.length());
    }
}
