/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectorsPartitioning4 {

    public static void main(String args[]) {
        Stream<Integer> values = IntStream.rangeClosed(10, 15).boxed(); //1  boxed() converts primitive to wrapper type
        Object obj = values.collect(Collectors.partitioningBy(x -> x % 2 == 0)); //2 
        System.out.println(obj);
    }
}
