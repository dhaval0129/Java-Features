/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 *
 * @author djoshi
 */
public class TicketTaker {
    long ticketsSold;
    final AtomicInteger ticketsTaken;
    
    public TicketTaker() {
        ticketsSold = 0;
        ticketsTaken = new AtomicInteger(0);
    }
    
    public void performJob() {
        IntStream.iterate(1, p -> p + 1)
            .parallel()
            .limit(10)
            .forEach(i -> ticketsTaken.getAndIncrement());
        
        IntStream.iterate(1, q -> q + 1)
            .limit(5)
            .parallel()
            .forEach(i -> ++ticketsSold);
        
        System.out.println(ticketsTaken + " " + ticketsSold);
    }
    
    public static void main(String args[]) {
        new TicketTaker().performJob();
    }
}
