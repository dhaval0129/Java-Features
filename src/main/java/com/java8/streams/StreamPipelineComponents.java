/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

/**
 *
 * @author djoshi
 */
public class StreamPipelineComponents {

    // One way to understand the stream pipeline is to break the components
    // of the pipeline into separate statements.
    public static void main(String args[]) {
        Method[] objectMethods = Object.class.getMethods();
        Stream<Method> objectMethodStream = Arrays.stream(objectMethods); // source operations
        
        Stream<String> objectMethodNames = objectMethodStream
                .map(method -> method.getName());  // intermediate operations
        
        Stream<String> uniqueObjectMethodNames = objectMethodNames.distinct(); // intermediate operations
        
        uniqueObjectMethodNames.forEach(System.out::println); // terminal operations
    }
}
