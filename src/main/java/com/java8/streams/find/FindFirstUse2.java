/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.find;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

/**
 *
 * @author djoshi
 */
public class FindFirstUse2 {

    public static void main(String args[]) {
        OptionalDouble temperature = DoubleStream.of(-10.1, -5.4, 6.0, -3.4, 8.9, 2.2)
                .filter(temp -> temp > 0)
                .findFirst();

        System.out.println("First matching temprature > 0 is "
                + temperature.getAsDouble());

        Optional<String> nullableStr = Optional.ofNullable(null);
        System.out.println(nullableStr);
    }
}
