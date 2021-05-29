/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

/**
 *
 * @author djoshi
 */
public class UnaryOperation {

    public static int operate(IntUnaryOperator iuo) {
        return iuo.applyAsInt(5);
    }

    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> fo = a -> b -> a - b;  //1                 
        int x = operate(fo.apply(20)); //2         
        System.out.println(x);
    }
}
