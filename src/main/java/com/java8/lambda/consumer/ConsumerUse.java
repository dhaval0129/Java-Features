/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class ConsumerUse {

    public static void main(String args[]) {
        Stream<String> strings = Stream.of("hello", "world");
        Consumer<String> printString = System.out::println;
        strings.forEach(printString);
        
        // A Consumer<T> “consumes” something: it takes an argument (of generic type T) and 
        // returns nothing (void). You can call accept() method on a Consumer object.

        Consumer<String> printUpperCase = str -> System.out.println(str.toUpperCase());
        printUpperCase.accept("hello");
    }
}
