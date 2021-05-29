/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.object.creation;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author djoshi
 */
class SerializationExample implements Serializable {

    protected String name;

    SerializationExample(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        try {
            SerializationExample d
                    = new SerializationExample("GeeksForGeeks");
            FileOutputStream f = new FileOutputStream("file.txt");
            ObjectOutputStream oos = new ObjectOutputStream(f);
            oos.writeObject(d);
            oos.close();
            f.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
