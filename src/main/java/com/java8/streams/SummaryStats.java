/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.LongSummaryStatistics;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class SummaryStats {

    public static void main(String args[]) {
        LongStream s1 = LongStream.of(6, 10);
        LongSummaryStatistics stats = s1.summaryStatistics();
        System.out.println("Avg: " + stats.getAverage());
        System.out.println("Max: " + stats.getMax());
        System.out.println("Min: " + stats.getMin());
        System.out.println("Sum: " + stats.getSum());
        
        System.out.println();
        LongStream s2 = LongStream.of(9);
        s2.mapToObj(p -> p).forEach(System.out::print);
        
        System.out.println();
        Stream<Character> s3 = Stream.of('c', 'b', 'a');
        System.out.println(s3.sorted().findFirst());
    }
}
