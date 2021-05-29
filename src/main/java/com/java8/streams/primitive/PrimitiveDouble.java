/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.primitive;

import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class PrimitiveDouble {

    public static void main(String args[]) {
        DoubleStream oneValue = DoubleStream.of(3.14);
        DoubleStream varArgs = DoubleStream.of(1.0, 1.1, 1.2);

        oneValue.forEach(System.out::println);
        System.out.println();
        varArgs.forEach(System.out::println);

        DoubleStream random = DoubleStream.generate(Math::random);
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2);
        random.limit(3).forEach(System.out::println);
        System.out.println();
        fractions.limit(3).forEach(System.out::println);

        OptionalDouble avg = IntStream.of(10, 20, 30, 40).average();
        System.out.println(avg.getAsDouble());
    }
}
