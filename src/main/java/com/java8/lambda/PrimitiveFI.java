/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 *
 * Primitive version of Functional Interface
 */
public class PrimitiveFI {

    public static void main(String args[]) {

        // Primitive version of Predicate interface
        System.out.println("Primitive Predicate Interface");
        IntPredicate evenNums = i -> (i % 2) == 0;
        IntStream.range(1, 10)
            .filter(evenNums)
            .forEach(System.out::print);        
        
        // Primitive version of Function Interface
        System.out.println("\nPrimitive Function Interface: ");
        IntFunction absInt = Math::abs;
        System.out.println(absInt.apply(-10));

        // Primitive version of Supplier Interface
        System.out.println("\nPrimitive Supplier Interface");
        AtomicInteger ints = new AtomicInteger(0);
        IntStream.generate(ints::incrementAndGet)
                .limit(5)
                .forEach(System.out::print);
    }
}
