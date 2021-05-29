/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

/**
 *
 * @author djoshi
 */
public class StuckTurkeyCage implements AutoCloseable {

    @Override
    public void close() throws Exception {
        throw new Exception("Cage door does not close");
    }

    public static void main(String[] args) throws RuntimeException {
        try (StuckTurkeyCage t = new StuckTurkeyCage()) {
            System.out.println("Put turkeys in");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally");
        }
    }
}
