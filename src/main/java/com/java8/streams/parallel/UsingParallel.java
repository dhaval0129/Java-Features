/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.parallel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class UsingParallel {

    public static void main(String args[]) {
        Stream<String> parallelStream = Stream.of("a", "b", "c").parallel();

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> parStream = list.parallelStream();

        Stream.of("a", "b", "c", "d", "e")
                .forEach(System.out::print);

        System.out.println();
        Stream.of("a", "b", "c", "d", "e")
                .parallel()
                .forEach(System.out::print);
        
        System.out.println();
        Stream.of("a", "b", "c", "d", "e")
                .parallel()
                .forEachOrdered(System.out::print);
    }
}
