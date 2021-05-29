/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectorsToArrayList {

    public static void main(String args[]) {
        List<Integer> list1 = Stream.of(1, 2, 3, 4, 5)
                .collect(
                        () -> new ArrayList<>(),
                        (l, i) -> l.add(i),
                        (l1, l2) -> l1.addAll(l2)
                );
        System.out.println(list1);

        List<Integer> list2 = Stream.of(1, 2, 3, 4, 5)
                .collect(
                        () -> new ArrayList<>(),
                        (List<Integer> l, Integer i) -> l.add(i),
                        (List<Integer> l1, List<Integer> l2) -> l1.addAll(l2)
                );
        System.out.println(list2);

        List<Integer> list3 = Stream.of(1, 2, 3, 4, 5)
                .collect(
                        ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll
                );
        System.out.println(list3);
    }
}
