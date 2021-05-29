/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class Boat {

    private AtomicInteger i = new AtomicInteger(0);

    private void waitTillFinished(CyclicBarrier c) {
        try {
            c.await();
            System.out.print(i.incrementAndGet() + " ");
        } catch (Exception e) {
        }
    }

    public void row(ExecutorService service) {
        final CyclicBarrier cb = new CyclicBarrier(5);
        IntStream.iterate(1, i -> i + 1)
                .limit(12)
                .forEach(i -> service.submit(() -> waitTillFinished(cb)));
    }

    public static void main(String args[]) {
        ExecutorService service = null;
        try {
            service = Executors.newCachedThreadPool();
            new Boat().row(service);
        } finally {
            service.isShutdown();
        }
    }
}
