/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.concurrancy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author djoshi
 */
public class CollectionSync {

    public static void main(String args[]) {
        List<Integer> list = Collections.synchronizedList(
                new ArrayList<>(Arrays.asList(4, 3, 52)));

        synchronized (list) {
            for (int data : list) {
                System.out.print(data + " ");
            }
        }

        Map<String, Object> foodData = new HashMap<>();
        foodData.put("penguin", 1);
        foodData.put("flamingo", 2);

        Map<String, Object> syncFoodData = Collections.synchronizedMap(foodData);
        for (String key : syncFoodData.keySet()) {
            syncFoodData.remove(key);
        }

    }
}
