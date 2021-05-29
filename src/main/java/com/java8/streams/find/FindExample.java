/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.find;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class FindExample {
    
    public static void main(String args[]) {
        IntStream stream1 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        stream1.findFirst()
                .ifPresent(System.out::println);
        
        IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        stream2.findAny()
                .ifPresent(System.out::println);
        
        Stream<String> stream3 = Stream.empty();
        System.out.println(stream3.findAny().isPresent());
        
        IntStream stream4 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        stream4.filter(i -> i > 4)
                .findFirst()
                .ifPresent(System.out::println);
        
    }
}
