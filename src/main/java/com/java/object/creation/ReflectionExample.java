/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.object.creation;

import java.lang.reflect.Constructor;

/**
 *
 * @author djoshi
 */
public class ReflectionExample {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        try {
            Constructor<ReflectionExample> constructor
                    = ReflectionExample.class.getDeclaredConstructor();
            ReflectionExample r = constructor.newInstance();
            r.setName("GeeksForGeeks");
            System.out.println(r.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
