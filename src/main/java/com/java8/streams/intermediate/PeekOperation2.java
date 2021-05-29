/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.intermediate;

import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class PeekOperation2 {
    
    public static void main(String args[]) {
        IntStream.of(1, 2, 3, 4, 5, 6)
            .limit(3)
            .peek(i -> System.out.format("%d ", i))
            .sum();
                
    }
}
