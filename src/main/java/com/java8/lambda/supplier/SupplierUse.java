/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.supplier;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class SupplierUse {

    // A Supplier<T> “supplies” takes nothing but returns something: it has no arguments 
    // and returns an object (of generic type T). You can call get() method on a Supplier object.

    public static void main(String args[]) {
        Random random = new Random();
        Stream.generate(random::nextBoolean)
            .limit(2)
            .forEach(System.out::println);

        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());
    }
}
