/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author djoshi
 */
public class AtomicExample {

    private static AtomicInteger sheepCount1 = new AtomicInteger(0);
    private static int sheepCount2 = 0;

    public static void main(String args[]) throws InterruptedException {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();

            for (int i = 0; i < 100; i++) {
                service.execute(() -> {
                    sheepCount1.getAndIncrement();
                    sheepCount2++;
                });
            }
            Thread.sleep(100);
            System.out.println(sheepCount1 + " " + sheepCount2);
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
        
        AtomicInteger ai = new AtomicInteger(5);
        int x = ai.incrementAndGet();
        int y = ai.addAndGet(1);
        ai.compareAndSet(7, 10);
        System.out.println(x + " " + y + " " + ai);
    }
}
