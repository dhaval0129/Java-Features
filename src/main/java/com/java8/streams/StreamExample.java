/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class StreamExample {

    public static void main(String args[]) {
        long count = Stream.of(1, 2, 3, 4, 5)
                .map(i -> i * i)
                .peek(i -> System.out.printf("%d ", i)) // The peek is used for debugging purpose
                .count();

        System.out.printf("%nThe Stream has %d elements", count);
        System.out.println();
        DoubleStream.of(1.0, 4.0, 9.0)
                .map(Math::sqrt)
                .peek(System.out::println)
                .sum();
    }
}
