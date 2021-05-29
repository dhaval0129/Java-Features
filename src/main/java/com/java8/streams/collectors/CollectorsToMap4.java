/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectorsToMap4 {

    public static void main(String args[]) {
        Map<Integer, Integer> map1 = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.
                        toMap(i -> i, // key
                                i -> i * 2) // value
                );
        System.out.println(map1);

        Map<Integer, Integer> map2 = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors
                        .toMap(Function.identity(),
                                i -> i * 2)
                );
        System.out.println(map2);

        Map<Integer, List<Integer>> map3 = Stream.of(1, 2, 3, 4, 5, 6)
                .collect(Collectors.toMap(
                        i -> i % 2,
                        i -> new ArrayList<Integer>(Arrays.asList(i)),
                        (list1, list2) -> {
                            list1.addAll(list2);
                            return list1;
                        },
                        ConcurrentHashMap::new)
                );
        System.out.println(map3);
    }
}
