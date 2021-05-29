/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectorsToMap3 {

    public static void main(String args[]) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        TreeMap<Integer, String> map = ohMy.collect(Collectors.toMap(
                String::length, k -> k, (s1, s2) -> s1 + "," + s2, TreeMap::new));
        System.out.println(map); // // {5=lions,bears, 6=tigers}
        System.out.println(map.getClass()); // class. java.util.TreeMap
    }
}
