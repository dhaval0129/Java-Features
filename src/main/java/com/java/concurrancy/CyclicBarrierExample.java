/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author djoshi
 */
public class CyclicBarrierExample {

    private static void checkStep(CyclicBarrier barrier, String step) {
        // Do something ot prepare the step
        System.out.println(step + " is ready");
        try {
            barrier.await();
        } catch (Exception e) {

        }
    }

    public static void main(String args[]) {
        String[] steps = {"Read the recipe",
            "Gather the ingredients", "wash hands"};
        System.out.println("Preparing everything");

        Runnable allSet = () -> System.out.println("Everything's ready. Let's begin");

        ExecutorService executor = Executors.newFixedThreadPool(steps.length);
        CyclicBarrier barrier = new CyclicBarrier(steps.length, allSet);

        for (String step : steps) {
            executor.submit(() -> checkStep(barrier, step));
        }

        executor.shutdown();
    }
}
