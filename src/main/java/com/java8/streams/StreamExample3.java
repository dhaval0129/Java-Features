/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class StreamExample3 {
    // here we are not reusing the stream but List (messages)
    public static void main(String args[]) {
        List<StringBuilder> messages = Arrays.asList(new StringBuilder(), new StringBuilder());
        messages.stream().forEach(s -> s.append("helloworld")); // initialize each string builder object to hello world 
        messages.forEach(s -> {   // add comma between helloworld word at position 5
            s.insert(5, ",");
            System.out.println(s);
        });
    }
}
