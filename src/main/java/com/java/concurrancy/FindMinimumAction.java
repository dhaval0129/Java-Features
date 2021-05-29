/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author djoshi
 */
public class FindMinimumAction extends RecursiveAction {

    static final int SEQUENTIAL_THRESHOLD = 5;
    int[] data;
    int start;
    int end;

    FindMinimumAction(int[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        int length = end - start;

        if (length <= SEQUENTIAL_THRESHOLD) {
            // base case
            int min = computeMinimumDirectly();
            System.out.println("Minimum of this subarray: " + min);
        } else {
            int mid = start + length / 2;
            FindMinimumAction firstSubtask
                    = new FindMinimumAction(data, start, mid);
            FindMinimumAction secondSubtask
                    = new FindMinimumAction(data, mid, end);
            
            firstSubtask.fork();
            secondSubtask.compute();
            firstSubtask.join();
        }
    }

    int computeMinimumDirectly() {
        int min = Integer.MAX_VALUE;

        for (int i = start; i < end; i++) {
            if (data[i] < min) {
                min = data[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {
        int[] data = new int[20];
        Random random = new Random();

        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(100);
            System.out.println(data[i] + " ");

            // Lets print each subarray in a line
            if ((i + 1) % SEQUENTIAL_THRESHOLD == 0) {
                System.out.println();
            }
        }

        FindMinimumAction task = new FindMinimumAction(data, 0, data.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
    }
}
