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
class PrintData implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing record: " + i);
        }
    }
}

public class ThreadRunnable {

    public static void main(String args[]) {
        new Thread(new PrintData()).start();
    }
}
