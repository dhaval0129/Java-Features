/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class SortByLengthThenNaturalReversed {

    public static void main(String[] args) {
        String str = "follow your heart but take your brain with you";
        List words = Arrays.asList(str.split(" "));
        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        
        words.stream().distinct()
                .sorted(lengthCompare.thenComparing(String::compareTo).reversed())
                .forEach(System.out::println);
    }
}
