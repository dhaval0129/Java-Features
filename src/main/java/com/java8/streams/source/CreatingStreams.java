/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.source;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CreatingStreams {
    
    public static void main(String args[]) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> fromArray = Stream.of(1, 2, 3);
        
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListPrallel = list.parallelStream();
        
        Stream<Double> randoms = Stream.generate(Math::random);
        Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
        oddNumbers.limit(10).forEach(System.out::println);
    }
}
