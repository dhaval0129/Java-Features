/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author djoshi
 */
public class Athlete {
    
    int stroke = 0;
    
    public synchronized void swimming() {
        stroke++;
    }
    
    public static void main(String... laps) throws InterruptedException {
        ExecutorService s = Executors.newFixedThreadPool(10);
        Athlete a = new Athlete();
        for(int i = 0; i < 1000; i++) {
            s.execute(() -> a.swimming());
        }
        s.awaitTermination(1, TimeUnit.SECONDS);
        s.shutdown();
        System.out.print(a.stroke);
    }
}
