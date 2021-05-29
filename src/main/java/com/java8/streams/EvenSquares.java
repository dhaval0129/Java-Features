/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class EvenSquares {
    
    public static void main(String args[]) {
        IntStream.rangeClosed(0, 10)        // Source stream
            .map(i -> (i * i))              // Intermediate operations
            .filter(EvenNumbers::isEven)      // Intermediate operations
            .forEach(System.out::println);  // Terminal operations
    }
}
