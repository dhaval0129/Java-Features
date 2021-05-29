/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda;

import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * @author djoshi
 */
public class ConstructorReferences {

    public static void main(String args[]) {
//        Supplier<String> newString = String::new;
//        System.out.println(newString.get());

        // This code makes use of constructor references
        Supplier<String> newString = () -> new String("Hello World!");
        System.out.println(newString.get());

        Function<String, Integer> anotherInteger = Integer::new;
        System.out.println(anotherInteger.apply("100"));
    }
}
