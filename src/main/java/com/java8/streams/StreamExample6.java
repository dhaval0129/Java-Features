/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class StreamExample6 {

    public static void main(String args[]) {
        Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
            .map(str -> {
                System.out.println("Mapping: " + str);
                return str.length();
            })
            .filter(i -> {
                System.out.println("Filtering: " + i);
                return i > 3;
            })
            .limit(2)
            .forEach(System.out::println);
    }
}
