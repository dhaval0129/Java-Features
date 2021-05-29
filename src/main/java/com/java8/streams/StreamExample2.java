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
public class StreamExample2 {

    public static void main(String args[]) {
        List<StringBuilder> dList = Arrays.asList(new StringBuilder("a"), new StringBuilder("aa"));
        dList.stream().forEach(x -> x.append("b"));
        dList.stream().forEach(x -> System.out.println(x));

        List<Double> dList1 = Arrays.asList(10.0, 12.0);
        dList1.stream().forEach(x -> {
            x = x + 10;
        });
        dList1.stream().forEach(d -> System.out.println(d));
    }

}
