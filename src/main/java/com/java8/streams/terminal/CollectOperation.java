/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.terminal;

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class CollectOperation {

    // Collect operation does mutable reduction, It uses mutable object so 
    // it is efficuent from regular reduction
    public static void main(String args[]) {
        Stream<String> stream1 = Stream.of("w", "o", "l", "f");
        StringBuilder word = stream1.collect(StringBuilder::new,
                StringBuilder::append, StringBuilder::append);
        System.out.println(word.toString());
        
        Stream<String> stream2 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set1 = stream2.collect(TreeSet::new, 
                TreeSet::add, TreeSet::addAll);
        System.out.println(set1);
        
        Stream<String> stream3 = Stream.of("w", "o", "l", "f");
        TreeSet<String> set2 = stream3.collect(
                Collectors.toCollection(TreeSet::new)); // this will sort the words
        System.out.println(set2);
        
        Stream<String> stream4 = Stream.of("w", "o", "l", "f");
        Set<String> set3 = stream4.collect(Collectors.toSet());
        System.out.println(set3);
    }
}
