/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.find;

import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class ShortCircuitExample {

    public static void main(String args[]) {
        IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
        boolean b = stream.filter(i -> {
                System.out.println("Filter: " + i);
                return i % 2 == 0;
            }).allMatch(i -> {
                System.out.println("All Match: " + i);
                return i < 3;
            });
    }
}
