/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author djoshi
 */
public class COWArrayList {
    
    public static void main(String args[]) {
        List<Integer> list = new CopyOnWriteArrayList<>(Arrays.asList(4, 3, 52));
        
        for(Integer item: list) {
            System.out.print(item + " ");
            list.add(9); // 9 will be added every time we print
        }
        
        System.out.println();
        System.out.println("Size: " + list.size());
    }
}
