/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.parallel;

import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class UsingParallel2 {

    public static void main(String args[]) {
        long start = System.nanoTime();
        String first = Stream.of("a", "b", "c", "d", "e")
                .parallel().findFirst().get();
        long duration = (System.nanoTime() - start) / 1000000;
        System.out.println(first + " found in " + duration + " ms");
        
        long start1 = System.nanoTime();
        String any = Stream.of("a", "b", "c", "d", "e")
                .parallel().findAny().get();
        long end = (System.nanoTime() - start1 ) / 1000000;
        System.out.println(any + " found in " + end + " ms");
    }
}
