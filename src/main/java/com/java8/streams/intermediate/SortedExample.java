/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class SortedExample {

    public static void main(String args[]) {
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        list.stream().filter(n -> n.length() == 4).sorted()
                .limit(2).forEach(System.out::println);

        System.out.println();
        System.out.println();
        List words = Arrays.asList("follow your heart but take your brain with you".split(" "));
        words.stream().distinct().sorted().forEach(System.out::println);
        // stream hangs becasuse it is infinite stream,  
//        Stream.generate(() -> "Elsa")
//                .filter(n -> n.length() == 4)
//                .sorted()
//                .limit(2)
//                .forEach(System.out::println);
    }
}
