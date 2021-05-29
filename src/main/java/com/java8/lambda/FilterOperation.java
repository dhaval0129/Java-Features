/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class FilterOperation {
    // Filter operation is intermediate operation
    public static void main(String args[]) {
        List<Integer> str = Arrays.asList(1, 2, 3, 4);
        str.stream().filter(x -> {
            System.out.print(x + " ");
            return x > 2;
        });
    }
}
