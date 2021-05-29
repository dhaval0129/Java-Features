/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 *
 * @author djoshi
 */
class SplQueue {

    private Deque<String> splQ = new ArrayDeque<>();

    void addInQueue(String customer) {
        splQ.addLast(customer);
    }

    void removeFront() {
        splQ.removeFirst();
    }

    void removeBack() {
        splQ.removeLast();
    }

    void printQueue() {
        System.out.println("Speical queue contains: " + splQ);
    }
}

public class SplQueueTest {

    public static void main(String args[]) {
        SplQueue splQ = new SplQueue();
        splQ.addInQueue("Harrison");
        splQ.addInQueue("McCartney");
        splQ.addInQueue("Starr");
        splQ.addInQueue("Lennon");
        splQ.printQueue();
        splQ.removeFront();
        splQ.removeBack();
        splQ.printQueue();
    }
}
