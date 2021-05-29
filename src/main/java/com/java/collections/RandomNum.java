/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author djoshi
 */
public class RandomNum {
    
    public static void main(String args[]) {
        int r = ThreadLocalRandom.current().nextInt(1, 11);
        System.out.println(r);
        r = (int) (Math.random() * 10);
        System.out.println(r);
    }
}
