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
 * Java Example of Negate Predicate
 *
 */
public class PredicateNegate {
    // Anonymous class implementation for predicate
    private static Predicate<String> negatePredicate = t -> (t.length() > 10);

    private static void predicate_Negate() {
        String lengthGTThan10 = "Space the final frontier, These are voyages for starship enterprise";
        boolean outcome = negatePredicate.negate().test(lengthGTThan10);
        System.out.println(outcome);
    }

    public static void main(String args[]) {
        predicate_Negate();
    }
}
