/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class ComparatorExample {

    public static void main(String args[]) {
        List<Integer> list1 = Arrays.asList(57, 38, 37, 54, 2);
        list1.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("");
        List<String> strings1 = Arrays.asList("Stream", "Operations", "on", "Collections");
        strings1.stream()
                .sorted(Comparator.comparing((String s) -> s.length()).reversed())
                .forEach(System.out::println);

        System.out.println("");
        List<Integer> list2 = Arrays.asList(57, 38, 37, 54, 2);
        System.out.println(list2.stream().count()); // 5

        System.out.println("");
        List<String> strings2 = Arrays.asList("Stream", "Operations", "on", "Collections");
        strings2.stream()
                .min(Comparator.comparing((String s) -> s.length()))
                .ifPresent(System.out::println); // on

        System.out.println("");
        System.out.println(
                IntStream.of(28, 4, 91, 20).sum()
        );
    }
}
