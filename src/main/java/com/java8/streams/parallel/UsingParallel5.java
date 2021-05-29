/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.parallel;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class UsingParallel5 {

    public static void main(String args[]) {
        int total1 = IntStream.of(1, 2, 3, 4, 5, 6)
                .reduce(4, (sum, n) -> sum + n);

        System.out.println(total1);

        int total2 = IntStream.of(1, 2, 3, 4, 5, 6)
                .parallel()
                .reduce(4, (sum, n) -> sum + n);
        System.out.println(total2);

        int length = Stream.of("Parallel", "streams", "are", "great")
                .parallel()
                .reduce(0,
                    (accumInt, str) -> accumInt + str.length(),
                    (accumInt1, accumInt2) -> accumInt1 + accumInt2);
        System.out.println(length);
    }
}
