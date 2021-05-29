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
public class Question_11_1 {

    public static Runnable print() {
        return () -> {
            System.out.println("Hi");
        };
    }

    public static void main(String[] args) {
        Runnable r = Question_11_1::print;
        r.run();
    }
}
