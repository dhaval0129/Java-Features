/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.function.BinaryOperator;

/**
 *
 * @author djoshi
 */
public class BinaryOperatorExample {

    public static void main(String args[]) {
        BinaryOperator<String> b1 = String::concat; // method references
        BinaryOperator<String> b2 = (string, toAdd) -> string.concat(toAdd); // lambda expression

        System.out.println(b1.apply("Space ", "the final frontier")); 
        System.out.println(b2.apply("These are voyages ", "of star ship enterprise")); 
    }
}
