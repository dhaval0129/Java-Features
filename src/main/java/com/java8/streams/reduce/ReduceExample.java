/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.reduce;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class ReduceExample {

    public static void main(String args[]) {
        OptionalInt total1 = IntStream.of(1, 2, 3, 4, 5, 6)
                .reduce((sum, n) -> sum + n);
        System.out.println(total1.getAsInt());

        int total2 = IntStream.of(1, 2, 3, 4, 5, 6)
                .reduce(0, (sum, n) -> sum + n);
        System.out.println(total2);

        int length1 = Stream.of("Parallel", "streams", "are", "great")
                .reduce(0, (accumInt, str) -> accumInt + str.length(), // accumulator
                        (accumInt1, accumInt2) -> accumInt1 + accumInt2); // combiner
        System.out.println(length1);

        int length2 = Stream.of("Parallel", "streams", "are", "great")
                .reduce(0, (Integer accumInt, String str) -> accumInt + str.length(), //accumulator
                        (Integer accumInt1, Integer accumInt2) -> accumInt1 + accumInt2);//combiner
        System.out.println(length2);

        int length3 = Stream.of("Parallel", "streams", "are", "great")
                .mapToInt(s -> s.length())
                .reduce(0, (sum, strLength) -> sum + strLength);
        System.out.println(length3);
        
        int length4 = Stream.of("Parallel", "streams", "are", "great")
                .mapToInt(s -> s.length())
                .sum();
        System.out.println(length4);
    }
}
