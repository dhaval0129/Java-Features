/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author djoshi
 */
public class StaticSynchronization {

    private static int n = 0;

    private /*synchronized*/ static void add() {
        synchronized (StaticSynchronization.class) {
            n++;
            System.out.println(n);
        }
    }

    public static void main(String args[]) {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Runnable r = () -> add();

        for (int i = 0; i < 4; i++) {
            service.execute(r);
        }
        service.shutdown();
    }
}
