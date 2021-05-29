/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.io;

import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author djoshi
 */
public class IOExample {
    
    public static void main(String args[]) throws IOException {
        byte[] b = new byte[10];
        InputStream in = System.in;
        int i = in.read(b);
        
        // it will print 10 characters since byte array is of size 10
        for(byte c: b) {
            System.out.print((char) c);
        }
        in.close();
    }
}
