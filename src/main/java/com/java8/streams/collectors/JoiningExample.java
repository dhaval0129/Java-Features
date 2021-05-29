/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class JoiningExample {

    public static void main(String args[]) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        String result = ohMy.collect(Collectors.joining(", "));
        System.out.println(result); // lions, tigers, bears

        String s1 = Stream.of("a", "simple", "string")
                .collect(Collectors.joining());  // 0 parameter
        System.out.println(s1);

        String s2 = Stream.of("a", "simple", "string")
                .collect(Collectors.joining(" ")); // 1 parameter
        System.out.println(s2);

        String s3 = Stream.of("a", "simple", "string")
                .collect(
                        Collectors.joining(" ", "This is ", ".") // 3 parameter (delimeter, prefix, suffix)
                ); 
        System.out.println(s3);
    }
}
