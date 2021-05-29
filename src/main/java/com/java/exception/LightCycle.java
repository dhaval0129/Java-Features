/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

/**
 *
 * @author djoshi
 * 
 */
class DiskPlayer implements AutoCloseable {
    @Override
    public void close() throws Exception {        
    }
}
public class LightCycle {
    public static void main(String... bits) throws Exception {
        try(DiskPlayer john = new DiskPlayer()) {
            System.out.println("ping");
        } finally {
            System.out.println("pong");
        }
        System.out.println("return");
    }
}
