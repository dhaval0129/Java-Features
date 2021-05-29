/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.find;

import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class MatchExample {

    public static void main(String args[]) {

        // Any Match example 
        IntStream stream1 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(
                stream1.anyMatch(i -> i % 3 == 0)
        ); // true

        IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(
                stream2.anyMatch(i -> i % 10 == 0)
        ); // false

        // Stream Empty example
        IntStream stream3 = IntStream.empty();
        System.out.println(
                stream3.anyMatch(i -> i % 2 == 0)
        ); // false

        IntStream stream4 = IntStream.empty();
        System.out.println(
                stream4.allMatch(i -> i % 3 == 0)
        ); // true

        IntStream stream5 = IntStream.empty();
        System.out.println(
                stream5.noneMatch(i -> i % 4 == 0)
        ); // true

        // Stream All Match example
        IntStream stream6 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(
                stream6.allMatch(i -> i > 0)
        ); // true

        IntStream stream7 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(
                stream7.allMatch(i -> i % 3 == 0)
        ); // false

        // Stream None Match example
        IntStream stream8 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(
                stream8.noneMatch(i -> i > 0)
        ); // false

        IntStream stream9 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(
                stream9.noneMatch(i -> i % 3 == 0)
        ); // false

        IntStream stream10 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        System.out.println(
                stream10.noneMatch(i -> i > 10)
        ); // true
    }
}
