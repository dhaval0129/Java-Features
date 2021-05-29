/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.flatmap;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class UsingFlatMap {
    
    public static void main(String args[]) {
        List<List<Integer>> intsOfInts = Arrays.asList(
            Arrays.asList(1, 3, 5),
            Arrays.asList(2, 4));
        
        // flatMap() flattens the streams, that results from mapping each of its elements into one flat stream
        intsOfInts.stream()
            .flatMap(ints -> ints.stream()) // flat map method flattens the stream
            .sorted()
            .map(i -> i * i)
            .forEach(System.out::println);
    }
}
