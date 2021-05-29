/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

import java.io.Closeable;

/**
 *
 * @author djoshi
 */
class ReadSign implements Closeable {

    @Override
    public void close() {
    }
    
    public String get() {
        return "Hello!!!";
    }
}

class MakeSign implements AutoCloseable {

    @Override
    public void close() {
        
    }
    
    public void send(String message) {
        System.out.print(message);
    }
}

public class Translate {

    public static void main(String... hands) {
        try (ReadSign r = new ReadSign();
                MakeSign w = new MakeSign();) {
            w.send(r.get());
        }
    }
}
