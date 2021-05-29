/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author djoshi
 */
public class CollectorsToSet {
    
    public static void main(String args[]) {
        String[] roseQuote = "a rose is a rose is a rose".split(" ");
        Set<String> words = Arrays.stream(roseQuote)
                .collect(Collectors.toSet());
        words.forEach(System.out::println);
    }
}
