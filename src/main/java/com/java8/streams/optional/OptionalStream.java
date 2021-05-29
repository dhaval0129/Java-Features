/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class OptionalStream {

    // Optional is the holder value that can be null
    private static void selectHighestTemperature(Stream<Double> temperatures) {
        Optional<Double> max = temperatures.max(Double::compareTo);
        if (max.isPresent()) {
            System.out.println(max.get());
        }
    }

    public static void selectHighestTemperature(DoubleStream temperatures) {
        OptionalDouble max = temperatures.max();
        max.ifPresent(System.out::println);
    }

    public static void main(String args[]) {
        Optional<String> s1 = Optional.of(" abracadabra ");
        s1.map(String::trim).ifPresent(System.out::println);

        Optional<String> s2 = Optional.ofNullable(null);
        System.out.println(s2.map(String::length).orElse(-1));

        // This code will throw illegal argument exception 
//        Optional<String> s3 = Optional.ofNullable(null);
//        System.out.println(s3.map(String::length)
//                .orElseThrow(IllegalArgumentException::new));
        selectHighestTemperature(Stream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));
    }
}
