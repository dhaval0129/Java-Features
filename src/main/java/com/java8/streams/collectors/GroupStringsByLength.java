/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.collectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class GroupStringsByLength {

    public static void main(String args[]) {
        String[] string = "you never know what you have until you clean your room".split(" ");
        Stream<String> distinctWords = Arrays.stream(string).distinct();

        Map<Integer, List<String>> wordsGroups
                = distinctWords.collect(Collectors.groupingBy(String::length));
        wordsGroups.forEach(
                (count, words) -> {
                    System.out.printf("word(s) of length %d %n", count);
                    words.forEach(System.out::println);
                });

    }
}
