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
public class FunctionUse3 {

    // The Function interface also has default methods such as 
    // compose(), andThen(), and identity().
    
    public static void main(String args[]) {
        // Method References example
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> absInt = Math::abs;
        
        // Difference is andThen applies argument after calling current function
        // and compose applies argument before calling current function.
        
        // andThen
        Function<String, Integer> parseAndAbsInt = parseInt.andThen(absInt);
        // compose
//        Function<String, Integer> parseAndAbsInt = absInt.compose(parseInt);
        
        Arrays.stream("4, -9, 16".split(", "))
            .map(parseAndAbsInt)
            .forEach(System.out::println);

        // The identity() function in Function just returns the passed argument 
        // without doing anything! Then what is its use ? It is sometimes used for testing
        // just similar to peek() in stream;
        System.out.println("\nUse of identity function");
        Arrays.stream("4, -9, 16".split(", "))
            .map(Function.identity())
            .forEach(System.out::println);
    }
}
