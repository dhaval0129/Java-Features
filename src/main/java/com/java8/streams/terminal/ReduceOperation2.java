/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.terminal;

import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class ReduceOperation2 {
    // 3 ways reduce function can be called
    
    public static void main(String args[]) {
        BinaryOperator<Integer> op = (a, b) -> a * b;
        Stream<Integer> empty = Stream.empty();
        Stream<Integer> oneElement = Stream.of(3);
        Stream<Integer> threeElement = Stream.of(3, 5, 6);
        
        empty.reduce(op).ifPresent(System.out::println); // no output
        oneElement.reduce(op).ifPresent(System.out::println); // 3
        threeElement.reduce(op).ifPresent(System.out::println); //90
        
        BinaryOperator<Integer> op2 = (a, b) -> a * b;
        Stream<Integer> stream = Stream.of(3, 5, 6);
        System.out.println(stream.reduce(1, op2, op2)); //90
    }
}
