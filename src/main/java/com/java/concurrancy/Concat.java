/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class Concat {

    public String concat1(List<String> values) {
        return values.parallelStream()
                .reduce("a", (x, y) -> x + y, String::concat);
    }
    
    public String concat2(List<String> values) {
        return values.parallelStream()
                .reduce((w,z) -> z+w).get();
    }
    
    public static void main(String args[]) {
        Concat c = new Concat();
        List<String> list = Arrays.asList("Cat", "Hat");
        String x = c.concat1(list);
        String y = c.concat2(list);
        System.out.print(x + " " + y);
    }
}
