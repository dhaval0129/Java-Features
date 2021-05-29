/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.find;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class FindFirstUse1 {
    
    public static void main(String args[]) {
        Method[] methods = Stream.class.getMethods();
        Optional<String> methodName = Arrays.stream(methods)
            .map(method -> method.getName())
            .filter(name -> name.endsWith("Match"))
            .sorted()
            .findFirst();
        
        System.out.println("Result: " + methodName.orElse("No suitable method found"));
    }
}
