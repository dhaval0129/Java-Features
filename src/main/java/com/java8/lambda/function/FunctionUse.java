/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.Arrays;
import java.util.function.Function;

/**
 *
 * @author djoshi
 */
public class FunctionUse {

    // The Function interface also has other default methods such as 
    // compose(), andThen(), and identity().
    public static void main(String args[]) {
        // converts -ve value in stream to absolute value
        Arrays.stream("4, -9, 16".split(", "))
                .map(Integer::parseInt)
                .map(i -> (i < 0) ? -i : i)
                .forEach(System.out::println);

        System.out.println("\nUse of Functions in Lambda");
        // Here the second argument Integer is the return type
        Function<String, Integer> strLength = str -> str.length();
        System.out.println(strLength.apply("supercalifragilisticexpialidocious"));

        System.out.println("\nSimple Function use: ");
        Function<String, Integer> f1 = String::length;
        Function<String, Integer> f2 = x -> x.length();
        System.out.println(f1.apply("cluck")); // 5
        System.out.println(f2.apply("cluck")); // 5

    }
}
