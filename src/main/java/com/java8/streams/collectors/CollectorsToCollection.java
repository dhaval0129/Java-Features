/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectorsToCollection {

    public static void main(String args[]) {
        Deque<Integer> deque = Stream.of(1, 2, 3)
                .collect(Collectors.toCollection(ArrayDeque::new));
        System.out.println(deque);
    }
}
