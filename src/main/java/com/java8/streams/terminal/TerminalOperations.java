/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.terminal;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 *
 * @author djoshi
 */
public class TerminalOperations {

    public static void main(String args[]) {
        // converts string into array of words object
        Object[] words = Pattern.compile(" ")
                .splitAsStream("1 2 3 4 5 6")
                .toArray();
        
        // convert array of words object to string and then maps to integer and laters add all integers
        System.out.println(Arrays.stream(words)   // source stream
                .mapToInt(str -> Integer.valueOf((String) str)) // intermediate operations
                .sum());    // terminal operations
    }
}
