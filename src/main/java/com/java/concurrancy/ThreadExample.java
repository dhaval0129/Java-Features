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
public class ThreadExample extends Thread {

    private static volatile int threadcounter = 0;

    @Override
    public void run() {
        threadcounter++;
        System.out.println(threadcounter);
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            synchronized (ThreadExample.class) {
                new ThreadExample().start();
            }
        }
    }
}
