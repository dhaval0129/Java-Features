/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 *
 * @author djoshi
 */
public class BiFunctionalInterface {

    public static void main(String args[]) {
        // BiPredicate example
        BiPredicate<List<Integer>, Integer> listContains = List::contains;
        List aList = Arrays.asList(10, 20, 30);
        System.out.println(listContains.test(aList, 20));

        // BiConsumer Interface
        BiConsumer<List<Integer>, Integer> listAddElement = List::add;
        List bList = new ArrayList();
        listAddElement.accept(bList, 10);
        System.out.println(bList);

        // BiFunction Interface
        BiFunction<String, String, String> concatStr = (x, y) -> x + y;
        System.out.println(concatStr.apply("hello ", "world"));

        BiFunction<Double, Double, Integer> compareDoubles = Double::compare;
        System.out.println(compareDoubles.apply(10.0, 10.0));
        
        // There is no BiSupplier
    }
}
