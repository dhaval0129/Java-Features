/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectorsCounting {

    public static void main(String args[]) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(
                String::length, Collectors.counting()));
        System.out.println(map);

        long count = Stream.of(1, 2, 3)
                .collect(Collectors.counting()); // 3
        System.out.println(count);
    }
}
