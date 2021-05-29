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
public class SheepManager {

//    private int sheepCount = 0;
    private AtomicInteger sheepCount = new AtomicInteger(0);
    
    private synchronized void incrementAndReport() {
//        System.out.print((++sheepCount) + " ");
        System.out.print(sheepCount.incrementAndGet() + " ");
    }
    
    public static void main(String args[]) {
        ExecutorService service = null;

        try {
            service = Executors.newFixedThreadPool(20);
            
            SheepManager manager = new SheepManager();
            for(int i = 0; i < 10; i++) {
                service.submit(() -> manager.incrementAndReport());
            }
        } finally {
            if (service != null) {
                service.shutdown();
            }
        }
    }
}
