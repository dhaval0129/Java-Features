/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.intermediate;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class UseSorted {
    
    public static void main(String args[]) {
        Stream<String> s1 = Stream.of("zoo-","dear-","brown-", "bear-");
        s1.sorted().forEach(System.out::print);
        
        System.out.println("\n");
        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
        s2.sorted(Comparator.reverseOrder())
            .forEach(System.out::print);
    }
}
