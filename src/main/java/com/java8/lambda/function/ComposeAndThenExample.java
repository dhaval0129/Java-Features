/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.function.Function;

/**
 *
 * @author djoshi
 */
public class ComposeAndThenExample {

    public static void main(String args[]) {
        // declaration is similar to int i = 10, j = 5, k = i + j;
        Function<Integer, Integer> negate = (i -> -i), square = (i -> i * i);
        
        // compose applies argument (square) first and then calls current function (negate).
        Function<Integer, Integer>  negateSquare = negate.compose(square);
        // andThen applies current function (negate) first and then argument (square).
        Function<Integer, Integer>  squareNegate = negate.andThen(square);
                
        System.out.println(negateSquare.apply(10));
        System.out.println(squareNegate.apply(10));
    }
}
