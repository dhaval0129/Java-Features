/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class StreamBuilder {

    public static void main(String args[]) {
        // stream() method was added in Arrays in class Java 8
        Arrays.stream(new int[]{1, 2, 3, 4, 5});
        Arrays.stream(new Integer[]{1, 2, 3, 4, 5});

        // Stream.of() method in stream interface takes variable argument list
        Stream.of(1, 2, 3, 4, 5);
        Stream.of(new Integer[] {1, 2, 3, 4, 5});

        // you can use the builder() method and build the Stream object by adding each element
        Stream s = Stream.builder().add(1).add(2).add(3).add(4).add(5).build();
        s.forEach(System.out::println);
    }
}
