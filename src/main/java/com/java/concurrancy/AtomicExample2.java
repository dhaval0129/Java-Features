/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author djoshi
 */
public class AtomicExample2 {
    int val = 10;
    int x;
    
    AtomicExample2(int i) {
        val = i;
    }
    
    private AtomicInteger value = new AtomicInteger(val);
    
    public static void main(String args[]) {
        AtomicExample2 at = new AtomicExample2(5);
        System.out.print(at.value.decrementAndGet());
    }
}
