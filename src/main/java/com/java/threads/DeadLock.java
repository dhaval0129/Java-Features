/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

/**
 *
 * @author djoshi
 */
class Balls {

    public static long balls = 0;
}

class Runs {

    public static long runs = 0;
}

class Count implements Runnable {

    public void IncrementBallAfterRun() throws InterruptedException {
            Runs.runs++;
            Balls.balls++;
            Thread.sleep(10);
    }

    public void IncrementRunAfterBall() throws InterruptedException {
        for (int i = 0; i < 5000; i++) {
            Balls.balls++;
            Runs.runs++;
            Thread.sleep(10);
        }
    }

    @Override
    public void run() {
        try {
            IncrementBallAfterRun();
            IncrementRunAfterBall();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class DeadLock {

    public static void main(String args[]) throws InterruptedException {
        Count c = new Count();
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
        System.out.println("Waiting for threads to complete execution...");
        t1.join();
        t2.join();
        System.out.println("Done");
    }
}
