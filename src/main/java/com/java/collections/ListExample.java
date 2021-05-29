/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class ListExample {
    
    public static void main(String args[]) {
        List list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add(7);
        
        for(Object s: list) {
            System.out.print(s);
        }
    }
}
