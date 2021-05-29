/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author djoshi
 */
public class Parallelism {

    public static void main(String[] args) {
//        System.setProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "8");
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(ForkJoinPool.commonPool().getParallelism());
    }
}
