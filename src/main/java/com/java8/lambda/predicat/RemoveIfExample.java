/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.predicat;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author djoshi
 */
public class RemoveIfExample {

    int value;

    RemoveIfExample(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + value;
    }

    public static void main(String[] args) {
        RemoveIfExample[] dataArr = new RemoveIfExample[]{
            new RemoveIfExample(1),
            new RemoveIfExample(2),
            new RemoveIfExample(3),
            new RemoveIfExample(4)
        };

        List<RemoveIfExample> dataList = new CopyOnWriteArrayList(Arrays.asList(dataArr));     
        
        for (RemoveIfExample element : dataList) {
            dataList.removeIf((RemoveIfExample e) -> {
                return e.value % 2 == 0;
            });
        }                   
    }
}
