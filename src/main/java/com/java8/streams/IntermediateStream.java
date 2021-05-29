/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class IntermediateStream {

    public static void main(String args[]) {

        long d = Stream.of(1, 2, 3, 4, 5)    // Source Stream
                .map(i -> i * i)    // Intermediate Operation
                .count();           // Terminal Operation
        // count() terminal operation returns long
        System.out.println("count: " + d);

        Stream.of(1, 2, 3, 4, 5)                        // Source Stream
                .map(i -> i * i)                        // Intermediate Operation
                .peek(i -> System.out.printf("%d ", i)) // Terminal Operation
                .count();                               // Terminal Operation
        
        System.out.println();
        Stream.of(1, 2, 3, 4, 5)                        // Source Stream
                .peek(i -> System.out.printf("%d ", i)) // intermediate operation 
                .map(i -> i * i)                        // intermediate operation 
                .peek(i -> System.out.printf("%d ", i)) // intermediate operation 
                .count();                               // terminal operation
        
        

    }
}
