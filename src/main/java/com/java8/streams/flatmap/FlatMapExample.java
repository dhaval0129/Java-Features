/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class FlatMapExample {

    public static void main(String args[]) {
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList();

        Stream.of(l1, l2, l3)
            .flatMap(x -> x.stream())
            .map(x -> x + 1) // incrments the value
            .forEach(System.out::print);
    }
}
