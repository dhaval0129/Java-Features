/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.object.creation;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 *
 * @author djoshi
 */
public class DeserializationExample {

    public static void main(String[] args) {
        SerializationExample d = null;
        
        try {
            FileInputStream f = new FileInputStream("file.txt");
            ObjectInputStream ois = new ObjectInputStream(f);
            d = (SerializationExample) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        System.out.println(d.name);
    }
}
