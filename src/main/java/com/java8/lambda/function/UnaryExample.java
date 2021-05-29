/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.function.UnaryOperator;

/**
 *
 * @author djoshi
 */
public class UnaryExample {

    //unary and binary operators extends to function and bifunction so apply method is used
    public static void main(String args[]) {
        UnaryOperator<String> u1 = String::toUpperCase;
        UnaryOperator<String> u2 = x -> x.toLowerCase();

        System.out.println(u1.apply("star trek"));
        System.out.println(u2.apply("SPACE TRAVEL"));

    }
}
