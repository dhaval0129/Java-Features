/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class ConsumerOperation {

    public static void main(String args[]) {
        List<String> strList = Arrays.asList("a", "aa", "aaa");
        Function<String, Integer> f = x -> x.length();
        Consumer<Integer> c = x -> System.out.print("Len:" + x + " ");
        strList.stream().map(f).forEach(c);

        System.out.println("\n");
        Stream.of("hello", "world")
                .forEach(System.out::println);  // for each takes consumer as argument

        System.out.println();
        Consumer<String> first = t
                -> System.out.println("First:" + t);
        Consumer<String> second = t
                -> System.out.println("Second:" + t);
        first.andThen(second).accept("Hi");
        
    }
}
