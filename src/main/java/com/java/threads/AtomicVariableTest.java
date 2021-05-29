/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author djoshi
 */
class Cnt {
    public static Integer integer = new Integer(0);
    public static AtomicInteger atomicInteger = new AtomicInteger(0);
}

public class AtomicVariableTest {

    static class Incrementer extends Thread {

        @Override
        public void run() {
            Cnt.integer++;
            Cnt.atomicInteger.incrementAndGet();
        }
    }

    static class Decrementer extends Thread {

        @Override
        public void run() {
            Cnt.integer--;
            Cnt.atomicInteger.decrementAndGet();
        }
    }

    public static void main(String args[]) throws InterruptedException {
        Thread[] incrementerThread = new Incrementer[1000];
        Thread[] decrementerThread = new Decrementer[1000];

        for (int i = 0; i < 1000; i++) {
            incrementerThread[i] = new Incrementer();
            decrementerThread[i] = new Decrementer();
            incrementerThread[i].start();
            decrementerThread[i].start();
        }

        for (int i = 0; i < 1000; i++) {
            incrementerThread[i].join();
            decrementerThread[i].join();
        }

        System.out.printf("Integer value = %d, Atomic Integer value = %d ",
                Cnt.integer, Cnt.atomicInteger.get());
    }
}
