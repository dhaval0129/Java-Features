/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

/**
 *
 * @author djoshi
 */
import java.util.Arrays;
import java.util.Optional;

class StringConcatenator {

    public static String result = "";

    public static void concatStr(String str) {
        result = result + " " + str;
    }
}

public class StringSplitAndConcatenate {

    public static void main(String args[]) {
        String words[] = "the quick brown fox jumps over the lazy dog".split(" ");
        Arrays.stream(words).forEach(StringConcatenator::concatStr);
        System.out.println(StringConcatenator.result);

        String words1[] = "the quick brown fox jumps over the lazy dog".split(" ");
        Optional<String> originalString
                = (Arrays.stream(words1).parallel().reduce((a, b) -> a + " " + b));
        System.out.println(originalString.get());
    }
}
