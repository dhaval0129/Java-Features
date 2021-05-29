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
 * Java program to illustrate creation of Object using new keyword
 */
public class NewKeywordExample {

    String name = "GeeksForGeeks";

    public static void main(String[] args) {
        // Here we are creating Object of 
        // NewKeywordExample using new keyword
        NewKeywordExample obj = new NewKeywordExample();
        System.out.println(obj.name);
    }
}
