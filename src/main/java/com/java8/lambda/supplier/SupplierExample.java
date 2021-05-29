/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.supplier;

import java.time.LocalDateTime;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 *
 * @author djoshi
 */
public class SupplierExample {
    
    public static void main(String args[]) {
        Supplier<String> currentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(currentDateTime.get());
        
        // prints empty string
        Supplier<String> newString = String::new; // constructor reference
        System.out.println(newString.get());
        
        Function<String, Integer> anotherInteger = Integer::new;
        System.out.println(anotherInteger.apply("100"));
    }
}
