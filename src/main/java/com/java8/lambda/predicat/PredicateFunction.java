/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.predicat;

import java.util.function.Predicate;

/**
 *
 * @author djoshi
 *
 * Predicate into Function example
 *
 */
public class PredicateFunction {

    private static void pred(int number, Predicate<Integer> predicate) {
        if(predicate.test(number)) {
            System.out.println("Number: "+ number);
        } 
    }

    public static void main(String args[]) {
        pred(10, (i) -> i > 5);
        pred(4, (i) -> i > 5);
    }
}
