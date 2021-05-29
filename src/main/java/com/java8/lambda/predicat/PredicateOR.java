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
 * Predicate OR Example
 *
 */
public class PredicateOR {
    // Anonymous class implementation for predicate
    private static final Predicate<String> hasLengthOf10 = (String t) -> t.length() > 10;

    private static void predicate_OR() {
        Predicate<String> containsLetterA = p -> p.contains("A");
        String containsA = "And";
        boolean outcome = hasLengthOf10.or(containsLetterA).test(containsA);
        System.out.println(outcome);
    }

    public static void main(String[] args) {
        predicate_OR();
    }
}
