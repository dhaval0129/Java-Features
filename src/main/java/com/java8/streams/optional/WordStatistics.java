/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.optional;

import java.util.IntSummaryStatistics;
import java.util.regex.Pattern;

/**
 *
 * @author djoshi
 */
public class WordStatistics {

    public static void main(String args[]) {
        String limerick = "There was a younf lady named Bright "
                + "who traveled much faster than light"
                + "She set out one day "
                + "in a relative way"
                + "and came back the previoud night";

        IntSummaryStatistics wordStatistics = Pattern.compile(" ")
                .splitAsStream(limerick)
                .mapToInt(word -> word.length())
                .summaryStatistics();

        System.out.printf(" Number of words = %d \n Sum of the length of the words = %d \n"
                + " Minimum word size = %d \n Maximum word size %d \n "
                + "Average word size = %f \n", wordStatistics.getCount(),
                wordStatistics.getSum(), wordStatistics.getMin(),
                wordStatistics.getMax(), wordStatistics.getAverage());
    }
}
