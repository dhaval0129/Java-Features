/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.Deque;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author djoshi
 */
public class ConcurrentMapExample {

    public static void main(String args[]) {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("Zebra", 52);
        map.put("elephant", 10);
        System.out.println(map.get("elephant"));

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        queue.offer(31);
        System.out.println(queue.peek());
        System.out.println(queue.poll());

        Deque<Integer> deque = new ConcurrentLinkedDeque<>();
        deque.offer(10);
        deque.push(4);
        deque.offer(11);
        deque.push(5);
        deque.offerFirst(6);
        deque.offerLast(12);
        System.out.println(deque.peek());
        System.out.println(deque.pop());
    }
}
