/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.reduce;

import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 * 
 *  reduce() is terminal operation
 */
public class ReduceOperation {

    public static void main(String args[]) {
        System.out.println(IntStream.rangeClosed(1, 5)
                .reduce((x, y) -> (x * y)) // takes int bi operator as argument
                .getAsInt());

        System.out.println(IntStream.of(10, 20, 30, 40).sum()); // sum() returns int

        System.out.println(IntStream.of(10, 20, 30, 40)
                .reduce(0, ((sum, val) -> sum + val))); // takes int bi operator as argument
    }
}
