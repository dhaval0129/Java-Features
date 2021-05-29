/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.object.creation;

/**
 *
 * @author djoshi
 * 
 * Java program to illustrate creation of Object using new Instance
 */
public class CloneExample implements Cloneable {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    String name = "GeeksForGeeks";

    public static void main(String[] args) {
        CloneExample obj1 = new CloneExample();
        try {
            CloneExample obj2 = (CloneExample) obj1.clone();
            System.out.println(obj2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
