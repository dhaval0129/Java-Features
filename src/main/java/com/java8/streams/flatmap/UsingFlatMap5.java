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
public class UsingFlatMap5 {

    public static void main(String args[]) {
        List<List<Integer>> intsOfInts = Arrays.asList(
                Arrays.asList(1, 3, 5),
                Arrays.asList(2, 4));

        intsOfInts.stream()
                .flatMap(ints -> ints.stream())
                .map(i -> i * i)
                .sorted()
                .forEach(System.out::println);
    }
}
