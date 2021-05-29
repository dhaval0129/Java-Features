/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class SearchList<T> {
    private List<T> data;
    private boolean foundMatch = false;
    
    public SearchList(List<T> list) {
        this.data = list;
    }
    
    public void exists(T value, int start, int end) {
        if(end - start <= 1) {
            foundMatch  = foundMatch || value.equals(data.get(start));
        } else {
            final int middle = start + (end - start) / 2;
            new Thread(() -> exists(value, start, middle)).run();
            new Thread(() -> exists(value, middle, end)).run();
        }
    }
    
    public static void main(String args[]) throws Exception {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6);
        SearchList<Integer> t = new SearchList<Integer>(data);
        t.exists(5, 0, data.size());
        System.out.print(t.foundMatch);
    }
}
