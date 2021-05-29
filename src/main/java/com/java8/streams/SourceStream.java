/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class SourceStream {

    public static void main(String args[]) {
        List<String> strings = Arrays.asList("eeny", "meeny", "miny", "mo");
        strings.stream() // source operations
                .forEach(s -> System.out.println(s));

        IntStream.iterate(1, i -> i + 1)    // source operations
                .limit(5);

        Pattern.compile(" ")
                .splitAsStream("java 8 streams") // source operations
                .forEach(System.out::println);

        new Random().ints().limit(2) // source operations
                .forEach(System.out::println);

        "hello".chars().sorted() // source operations
                .forEach(ch -> System.out.printf("%c ", ch));

    }

}
