/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.find;

import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class MatchUse {

    public static void main(String args[]) {
        // Average tempratures in concordia, antartica 
        boolean anyMatch = IntStream.of(-56 -57 -55 -52 -48 -51 -49)
                .anyMatch(temp -> temp > 0);
        System.out.println("anyMatch(temp -> temp > 0): " + anyMatch);

        boolean allMatch = IntStream.of(-56 -57 -55 -52 -48 -51 -49)
                .allMatch(temp -> temp > 0);
        System.out.println("allMatch(temp -> temp > 0): " + allMatch);

        boolean noneMatch = IntStream.of(-56 -57 -55 -52 -48 -51 -49)
                .noneMatch(temp -> temp > 0);
        System.out.println("noneMatch(temp -> temp > 0): " + noneMatch);

    }
}
