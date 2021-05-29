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
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println("In run(); thread name is: " + getName());
    }

    public static void main(String args[]) {
        Thread myThread = new MyThread();
        myThread.start();
        System.out.println("In main(); thread name: " 
                + Thread.currentThread().getName());
    }
}
