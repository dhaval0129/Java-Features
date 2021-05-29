/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class UnaryOperatorInterface {

    public static void main(String args[]) {
        // UnaryOperator is a functional interface and it extends Function interface, 
        // and you can use the apply() method declared in the Function interface 
        // it inherits the default functions compose() and andThen() from the Function interface        
        List<Integer> ell = Arrays.asList(-11, 22, 33, -44, 55);
        System.out.println("Before: " + ell);
        ell.replaceAll(Math::abs);
        System.out.println("After: " + ell);
        
        // Similar to UnaryOperator that extends Function interface, 
        // there is a BinaryOperator that extends BiFunction interface.
    }
}
