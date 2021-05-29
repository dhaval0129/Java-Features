/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

import java.util.concurrent.Executor;

/**
 *
 * @author djoshi
 */
class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Calling Task.run() ");
    }
}

class RepeatedExecutor implements Executor {

    @Override
    public void execute(Runnable runnable) {
        new Thread(runnable).start();
    }

    public void execute(Runnable runnable, int times) {
        System.out.printf("Calling Task.run() %d times throgh Executor.execute() %n", times);
        
        for (int i = 0; i < times; i++) {
            execute(runnable);
        }
    }
}

public class ExcutorTest {

    public static void main(String args[]) {
        Runnable runnable = new Task();
        System.out.println("Calling Task.run() by directly creating a Thread");
//        
//        Thread thread = new Thread(runnable);
//        thread.start();
        
        RepeatedExecutor executor = new RepeatedExecutor();
        executor.execute(runnable, 3);
    }
}
