/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

/**
 *
 * @author djoshi
 */
public class OptionalPrimitive {

    // Primitive version of optional and stream
    public static void selectHighestTemperature(DoubleStream tempratures) {
        OptionalDouble max = tempratures.max();
        max.ifPresent(System.out::println);
    }

    public static void main(String args[]) {
        Optional<String> empty = Optional.empty();
        Optional<String> nonEmptyOptional = Optional.of("abracadabra");
        Optional<String> nullableStr = Optional.ofNullable(null);
        System.out.println(nullableStr);

        selectHighestTemperature(DoubleStream.of(24.5, 23.6, 27.9, 21.1, 23.5, 25.5, 28.3));

    }
}
