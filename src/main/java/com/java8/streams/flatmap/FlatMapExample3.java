/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.flatmap;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class FlatMapExample3 {

    public static void main(String args[]) {
        List<String> list = new LinkedList<>();
//        list.add("test1");
//        list.add("test2");

        withFlatMap(list);
        withoutFlatMap(list);

        Deque<String> queue = new ArrayDeque<>();
        queue.push("all queued up");
        queue.push("last");

        withFlatMap(queue);
        withoutFlatMap(queue);
    }

    private static void withFlatMap(Collection<?> coll) {
        Stream.of(coll)
                .flatMap(x -> x.stream())
                .forEach(System.out::print);
        System.out.println();
    }

    private static void withoutFlatMap(Collection<?> coll) {
        Stream.of(coll)
                .filter(x -> !x.isEmpty())
                .map(x -> x)
                .forEach(System.out::print);
        System.out.println();
    }
}
