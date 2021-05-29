/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.predicat;

import java.util.function.Predicate;

/**
 *
 * @author djoshi
 */
public class PredicateUse {
    
    public static void main(String args[]) {
        Predicate<String> nullCheck = arg -> arg != null;
        Predicate<String> emptyCheck = arg -> arg.length() > 0;
        Predicate<String> nullAndEmptyCheck = nullCheck.and(emptyCheck);
        
        String helloStr = "hello";
        System.out.println(nullAndEmptyCheck.test(helloStr));
        
        String nullStr = null;
        System.out.println(nullAndEmptyCheck.test(nullStr));
    }
}
