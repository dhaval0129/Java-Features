/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.flatmap;

import java.util.Arrays;

/**
 *
 * @author djoshi
 * 
 * This is example of unique characters from list of words in sentence 
 * 
 * flatMap() flattens the streams, that results from mapping each of its elements into one flat stream
 */
public class UsingFlatMap2 {

    public static void main(String args[]) {
        System.out.println("Use Map method");
        String[] str1 = "you never know what you have until you clean your room".split(" ");
        Arrays.stream(str1)
                .map(word -> word.split("")) // map method transforms elements into stream
                .distinct()
                .forEach(System.out::println);
        
        // flatmap method operates on elements just like map() method. However, flatmap() flattens
        // the streams that results from mapping each of its elements into one flat stream
        System.out.println("\nUse of FlapMap");
        String[] str2 = "you never know what you have until you clean your room".split(" ");
        Arrays.stream(str2)
                .flatMap(word -> Arrays.stream(word.split("")))
                .distinct()
                .forEach(System.out::print);
        
    }
}
