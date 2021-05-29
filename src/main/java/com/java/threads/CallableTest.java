/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author djoshi
 */
class Factorial implements Callable<Long> {

    long n;

    public Factorial(long n) {
        this.n = n;
    }

    @Override
    public Long call() throws Exception {
        if (n <= 0) {
            throw new Exception("for finding factorial, N should be > 0");
        }
        
        long fact = 1;
        for (long longVal = 1; longVal <= n; longVal++) {
            fact *= longVal;
        }
        return fact;
    }
}

public class CallableTest {

    public static void main(String args[]) throws Exception {
        long N = 20;
        // get a callable task to be submitted to executor service
        Callable<Long> task = new Factorial(N);
        // create an ExecutorService with fixed thread pool having one thread
        ExecutorService es = Executors.newSingleThreadExecutor();
        // submit the task to the executor service and store to the future object
        Future<Long> future = es.submit(task);
        // wait for the get() method that blocks until the computation is complete
        System.out.printf("factorial of %d is %d", N, future.get());
        // done. shutdown the executor service since we don't need it any more
        es.shutdown();
        
    }
}
