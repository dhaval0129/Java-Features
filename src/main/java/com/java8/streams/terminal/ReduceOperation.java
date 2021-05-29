/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.terminal;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class ReduceOperation {

    // The reduce() method combines a stream into a single object. 
    // As you can tell from the name, it is a reduction
    public static void main(String args[]) {
        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        String word1 = stream1.reduce("", (s, c) -> s + c); // Lambda Expression
        System.out.println(word1);

        Stream<String> stream2 = Stream.of("w", "o", "1", "f");
        String word2 = stream2.reduce("", String::concat); // Method References
        System.out.println(word2);

        System.out.println(IntStream.of(10, 20, 30, 40).sum());

        System.out.println(IntStream.of(10, 20, 30, 40)
                .reduce(0, ((sum, val) -> sum + val)));

        System.out.println(IntStream.rangeClosed(1, 5)
                .reduce((x, y) -> (x * y)).getAsInt());
    }
}
