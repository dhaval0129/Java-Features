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
public class CheckResults2 {
    
    static int counter = 0;
    
    public static void main(String args[])  throws InterruptedException {
        
        new Thread(() -> {
            for(int i = 0; i < 500; i++) {
                CheckResults2.counter++;
            }
        }).start();
        
        while(CheckResults2.counter < 100){
            System.out.println("Not reached yet");
            Thread.sleep(1000); // 1 second
        }
    }
}
