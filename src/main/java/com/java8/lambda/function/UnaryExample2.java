/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.function.LongUnaryOperator;

/**
 *
 * @author djoshi
 */
public class UnaryExample2 {
    
    public static void main(String args[]) {
        LongUnaryOperator lou = l -> l * 2;
        long l = lou.compose(lou).applyAsLong(3);
        System.out.println(l);
    }
}
