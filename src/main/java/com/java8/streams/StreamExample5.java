/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class StreamExample5 {

    public static void main(String args[]) {
        List<String> strings = Arrays.asList("Stream", "Operations", "on", "Collections");
        strings.stream()
                .min(Comparator.comparing((String s) -> s.length()))
                .ifPresent(System.out::println);

        List<Integer> list = Arrays.asList(57, 38, 37, 54, 2);
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
