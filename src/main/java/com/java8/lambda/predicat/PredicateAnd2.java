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
 * Predicate Chaining 
 * 
 * http://www.geeksforgeeks.org/java-8-predicate-with-examples/
 * 
 */
public class PredicateAnd2 {
    
    public static void main(String args[]) {
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        
        // Creating predicate 
        Predicate<Integer> lowerThanTwenty = (i) -> i < 20;
        boolean result = greaterThanTen.and(lowerThanTwenty).test(15);
        System.out.println(result);
        
        // Calling predicate method
        boolean result2 = greaterThanTen.and(lowerThanTwenty).negate().test(15);
        System.out.println(result2);
    }
}
