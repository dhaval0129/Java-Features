/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda;

/**
 *
 * @author djoshi
 */
public class BlockLamda {

    interface LambdaFunction {
        String intKind(int a);
    }

    public static void main(String are[]) {
        LambdaFunction lambdaFunction = (int i) -> {
            if ((i % 2) == 0) {
                return "even";
            } else {
                return "odd";
            }
        };
        
        System.out.println(lambdaFunction.intKind(10));
    }
}
