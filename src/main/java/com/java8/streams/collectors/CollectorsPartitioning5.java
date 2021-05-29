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
public class CollectorsPartitioning5 {

    public static void main(String args[]) {
        Map<Boolean, List<Integer>> map1 = Stream.of(45, 9, 65, 77, 12, 89, 31)
                .collect(Collectors.partitioningBy(i -> i < 50));
        System.out.println(map1);

        List<Integer> lessThan50 = map1.get(true);
        List<Integer> moreThan50 = map1.get(false);
        System.out.println(lessThan50);
        System.out.println(moreThan50);
    }
}
