/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.function.Function;

/**
 *
 * @author djoshi
 */
public class FunctionUse4 {

    private static void round(double d, Function<Double, Long> f) {
        long result = f.apply(d);
        System.out.println(result);
    }

    public static void main(String args[]) {
        round(5.4, d -> Math.round(d));

        Function<String, String> f1 = s -> {
            return s.toUpperCase();
        };
        
        Function<String, String> f2 = s -> {
            return s.toLowerCase();
        };
        
        System.out.println(f1.compose(f2).apply("Compose"));
        System.out.println(f1.andThen(f2).apply("AndThen"));
    }
}
