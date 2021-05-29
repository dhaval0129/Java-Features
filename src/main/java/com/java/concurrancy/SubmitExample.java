/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author djoshi
 */
public class SubmitExample {

    public static void main(String args[]) throws InterruptedException, ExecutionException {
        Callable c = new Callable() {
            @Override
            public Object call() {
                return 10;
            }
        };

        ExecutorService s = Executors.newScheduledThreadPool(1);
        for (int i = 0; i < 10; i++) {
            Future f = s.submit(c);
            f.get();
        }
        
        s.shutdown();
        System.out.print("Done!!");
    }
}
