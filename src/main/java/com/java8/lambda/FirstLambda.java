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
interface LambdaFunction {
    void call();
}

public class FirstLambda {

    public static void main(String args[]) {
        LambdaFunction lambdaFunction = () -> System.out.println("Hello World");
        lambdaFunction.call();
    }
}
