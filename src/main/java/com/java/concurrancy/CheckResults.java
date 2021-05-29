/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

/**
 *
 * @author djoshi
 */
public class CheckResults {

    static int counter = 0;

    public static void main(String args[]) {
        // Runnable interface
        new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                CheckResults.counter++;
            }
        }).start();

        while(CheckResults.counter < 100) {
            System.out.println("Not yet reached");
        }
        
        System.out.println("Reached..!!");
    }
}
