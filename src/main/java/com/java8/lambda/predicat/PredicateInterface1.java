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
 * http://www.geeksforgeeks.org/java-8-predicate-with-examples/
 * 
 */
public class PredicateInterface1 {

    public static void main(String args[]) {
        // creating predicate
        Predicate<Integer> lesserthan = i -> (i < 18);
        // calling predicate
        System.out.println(lesserthan.test(10));
    }
}
