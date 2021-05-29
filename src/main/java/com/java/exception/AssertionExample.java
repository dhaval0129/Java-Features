/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

/**
 *
 * @author djoshi
 */
public class AssertionExample {

    public static void main(String args[]) {
        int i = -10;

        if (i < 10) {
            // if negative value, convert into positive
//            i = -i;
        }

        System.out.println("the value of i is: " + i);
        // at this point the assumption is that i cannot be negative
        // assert this condition since its an assumption that will always hold
        assert(i >= 0):"impossible: i is negative";
    }
}
