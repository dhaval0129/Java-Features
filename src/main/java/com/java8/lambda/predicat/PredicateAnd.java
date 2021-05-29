/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.predicat;

import java.util.Objects;
import java.util.function.Predicate;

/**
 *
 * @author djoshi
 * 
 * Java Example of And Predicate
 */
public class PredicateAnd {
    // Anonymous class implementation for predicate
    private static Predicate<String> hasLengthOf10 = new Predicate<String>() {
        
        @Override
        public boolean test(String t) {
            return t.length() > 10;
        }
    };
    
    private static void predicate_AND() {
        Predicate<String> nonNullPredicate = Objects::nonNull;
        String nullString = null;
        
        boolean outcome = nonNullPredicate.and(hasLengthOf10).test(nullString);
        System.out.println(outcome);
        
        String lengthGTThan10 = "Welcome to voyager";
        boolean outcome2  = nonNullPredicate.and(hasLengthOf10).test(lengthGTThan10);
        System.out.println(outcome2);
    }
    
    public static void main(String args[]) {
        predicate_AND();
    }
}
