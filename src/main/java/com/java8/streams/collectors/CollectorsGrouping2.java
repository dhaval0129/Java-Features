/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectorsGrouping2 {

    public static void main(String args[]) {
        Map<Integer, List<Integer>> map1
                = Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
                        .collect(
                                Collectors.groupingBy(
                                        i -> i / 10 * 10)
                        );
        System.out.println(map1);

        Map<Integer, Long> map2
                = Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
                        .collect(
                                Collectors.groupingBy(
                                        i -> i / 10 * 10,
                                        Collectors.counting())
                        );
        System.out.println(map2);

        Map<Integer, Map<String, List<Integer>>> map3
                = Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
                        .collect(
                                Collectors.groupingBy(i -> i / 10 * 10,
                                        Collectors.groupingBy(i -> i % 2 == 0 ? "EVEN" : "ODD")
                                )
                        );
        System.out.println(map3);
    }
}
