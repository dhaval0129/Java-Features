/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class SortingCollection {
    
    public static void main(String args[]) {
        List words = Arrays.asList("follow your heart but take your brain with you".split(" "));
        // converts words into streams and then identifies distinct words
        // then sorts those distinct words and prints it
        words.stream().distinct().sorted().forEach(System.out::println);
    }
}
