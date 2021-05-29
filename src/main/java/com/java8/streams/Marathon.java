/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
class Runner {
    private int numberMinutes;
    
    public Runner(int n) {
        numberMinutes = n;
    }
    
    public int getNumberMinutes() {
        return numberMinutes;
    }
    
    public boolean isFourMinuteMile() {
        return numberMinutes < 4 * 60;
    }
}
public class Marathon {
    
    public static void main(String args[]) {
        Stream<Runner> runners = Stream.of(new Runner(250),
                new Runner(600), new Runner(201));
        long count = runners
                .filter(r -> r.isFourMinuteMile())
                .count();
        System.out.println(count);
    }
}
