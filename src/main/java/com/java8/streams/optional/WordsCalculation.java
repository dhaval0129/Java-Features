/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.optional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

/**
 *
 * @author djoshi
 */
public class WordsCalculation {

    public static void main(String args[]) {
        String[] string = "you never know what you have until clean your room".split(" ");
        // String::compareTo it will compare string lexicographically or alphabetical or dicitionary order
        Optional<String> minOpt1 = Arrays.stream(string).min(String::compareTo);
        System.out.println(minOpt1.get());

        Comparator<String> lengthCompare = (str1, str2) -> str1.length() - str2.length();
        Optional<String> minOpt2 = Arrays.stream(string).min(lengthCompare);
        System.out.println(minOpt2.get());
    }
}
