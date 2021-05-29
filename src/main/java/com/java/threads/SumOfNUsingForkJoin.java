/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 *
 * @author djoshi
 */
public class SumOfNUsingForkJoin {

    private static long N = 1000_000;
    // one million - we want to compute sum from 1 .. one million
    private static final int NUM_THREADS = 10;
    // number of threads to create for distributing the effort

    static class RecursiveSumOfN extends RecursiveTask<Long> {

        long from, to;

        public RecursiveSumOfN(long from, long to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public Long compute() {
            if ((to - from) <= N / NUM_THREADS) {
                long localSum = 0;

                for (long i = from; i <= to; i++) {
                    localSum += i;
                }

                System.out.printf("\tSum of value range %d to %d is %d %n", from, to, localSum);
                return localSum;
            } else {
                // no, the range is too big for a thread to handle so fork the computation
                // we find the mid-point value in range from..to 
                long mid = (from + to) / 2;

                // determine the computation for first half with the range from..mid
                RecursiveSumOfN firstHalf = new RecursiveSumOfN(from, mid);

                // now fork off that task
                firstHalf.fork();

                // determine the computation for second half with the range mid+1..to
                RecursiveSumOfN secondHalf = new RecursiveSumOfN(mid + 1, to);
                long resultSecond = secondHalf.compute();

                // now, wait for the first half of computing sum to complete, 
                // once done , add it to remaining part
                return firstHalf.join() + resultSecond;
            }
        }
    }

    public static void main(String args[]) {
        // Create a fork-join pool that consists of NUM_THREADS
        ForkJoinPool pool = new ForkJoinPool(NUM_THREADS);

        // submit the computation task to fork-join pool
        long computedSum = pool.invoke(new RecursiveSumOfN(0, N));

        // this is the formula sum for range 1..N
        long formulaSum = (N * (N + 1)) / 2;

        // compare the computed sum and formula sum
        System.out.printf("Sum for range 1..%d; computed sum = %d formula sum = %d %n", N, computedSum, formulaSum);
    }
}
