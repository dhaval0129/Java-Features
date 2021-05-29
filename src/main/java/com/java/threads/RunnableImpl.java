/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

/**
 *
 * @author djoshi
 */
public class RunnableImpl implements Runnable {

    @Override
    public void run() {
        System.out.println("In run(); thread name is: " 
                + Thread.currentThread().getName());
    }

    public static void main(String args[]) {
        Thread myThread = new Thread(new RunnableImpl());
        myThread.start();
        System.out.println("In main(); thread name is: " 
                + Thread.currentThread().getName());
    }
}
