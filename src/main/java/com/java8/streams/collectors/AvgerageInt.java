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
public class AvgerageInt {

    public static void main(String args[]) {
        Stream<String> ohMy = Stream.of("lions", "tiger", "bears");
        double result = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result);

        double avg = Stream.of(1, 2, 3)
                .collect(Collectors.averagingInt(i -> i * 2));
        System.out.println(avg);
    }
}
