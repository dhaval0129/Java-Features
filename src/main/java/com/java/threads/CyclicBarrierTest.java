/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author djoshi
 */
class MixedDoubleTennisGame extends Thread {

    @Override
    public void run() {
        System.out.println("All four players ready, game starts \n Love all...");
    }
}

class Player extends Thread {
    CyclicBarrier waitPoint;
    
    Player(CyclicBarrier barrier, String name) {
        this.setName(name);
        waitPoint = barrier;
        this.start();
    }
    
    @Override
    public void run() {
        System.out.println("Player " + getName() + " is ready ");
        
        try {
            waitPoint.await();
        } catch(BrokenBarrierException | InterruptedException e) {
            System.out.println("An exception occurred while waiting..." + e);
        }
    }
}

public class CyclicBarrierTest {

    public static void main(String args[]) {
        System.out.println("Reserving tennis court \n"
                + "As soon as four players arrive, game will start");
        CyclicBarrier barrier = new CyclicBarrier(4, new MixedDoubleTennisGame());
        new Player(barrier, "G I Joe");
        new Player(barrier, "Dora");
        new Player(barrier, "Tintin");
        new Player(barrier, "Barbie");
    }
}
