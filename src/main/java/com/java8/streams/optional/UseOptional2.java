/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.streams.optional;

import java.util.Optional;
import java.util.OptionalInt;

/**
 *
 * @author djoshi
 */
public class UseOptional2 {

    public static void main(String args[]) throws Exception {
        Optional<String> summary = Optional.of("test summary");
        String summaryOrDefault = summary.orElse("Default Summary");
        String summaryOrDefault1 = summary.orElseGet(() -> "Default Summary");
        String summaryOrException = summary.orElseThrow(() -> new Exception());
        String summaryStr = summary
                .filter(s -> s.length() > 10)
                .orElse("Short Summary");
        int summaryLength = summary.map(s -> s.length()).orElse(0);
        System.out.println(summaryLength);
        
        OptionalInt optionalInt = OptionalInt.of(1);
        int i = optionalInt.getAsInt();
        System.out.println(i);
    }
}
