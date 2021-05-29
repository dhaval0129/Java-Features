/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static junit.framework.Assert.assertEquals;

/**
 *
 * @author djoshi
 *
 * assertEquals will return error if condition is false
 */
public class StreamOperations {

    public static void main(String args[]) {
        // collect(toList()) is an eager operation that generates a list from
        // the values in a Stream.
        List<String> collected1 = Stream.of("a", "b", "c")
                .collect(Collectors.toList());
        assertEquals(Arrays.asList("a", "b", "c"), collected1);

        // Map operation converts value of one type to another
        // map allows you to apply function to stream values , producing 
        // another stream of new values
        List<String> collected2 = Stream.of("a", "b", "hello")
                .map(string -> string.toUpperCase())
                .collect(Collectors.toList());
        assertEquals(Arrays.asList("A", "B", "HELLO"), collected2);

        // Filter operation is used when you are looping over some data and checking
        // each element which satisfy the condition for that element
        List<String> beginningWithNumbers
                = Stream.of("a", "1abc", "abc1")
                .filter(value -> Character.isDigit(value.charAt(0)))
                .collect(Collectors.toList());
        assertEquals(Arrays.asList("1abc"), beginningWithNumbers);

        // flatmap lets you replace value with stream and concatenates all stream togther
        List<Integer> together = Stream.of(Arrays.asList(1, 2), Arrays.asList(3, 4))
                .flatMap(num -> num.stream())
                .collect(Collectors.toList());
        assertEquals(Arrays.asList(1, 2, 3, 4), together);

        // reducer performs reduction of elements  
        int count = Stream.of(1, 2, 3)
                .reduce(0, (acc, element) -> acc + element);
        assertEquals(6, count);
       
        
        
    }
}
