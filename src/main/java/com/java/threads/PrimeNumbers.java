/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * @author djoshi
 */
public class PrimeNumbers {

    private static boolean isPrime(long val) {
        for (long i = 2; i <= val / 2; i++) {
            if ((val % i) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        long numOfPrimes = LongStream.rangeClosed(2, 100_000)
                .parallel()
                .filter(PrimeNumbers::isPrime)
                .count();
        System.out.println(numOfPrimes);

        System.out.println(IntStream.range(1, 10)
                .filter(i -> (i % 2) == 0)
                .isParallel());

        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(ints.parallelStream()
                .filter(i -> (i % 2) == 0)
                .isParallel());
    }
}
