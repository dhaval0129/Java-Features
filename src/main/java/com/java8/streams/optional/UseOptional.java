/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.optional;

import java.util.Optional;

/**
 *
 * @author djoshi
 */
public class UseOptional {

    private static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }

        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String args[]) {
        Optional<Double> o = average(90, 100);
        if (o.isPresent()) {
            System.out.println(o.get());
        }
        
        Optional<Double> opt = average();
        System.out.println(opt.orElse(Double.NaN));
        System.out.println(opt.orElseGet(() -> Math.random()));
        // This will throw Exception
//        System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
        
        // test Option.ofNullable
        Optional o1 = Optional.ofNullable("4");
        System.out.println(o1.get());
    }
}
