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
public class JammedTurkeyCage implements AutoCloseable {

    @Override
    public void close() throws IllegalStateException {
        throw new IllegalStateException("Cage door does not close");
    }

    public static void main(String[] args) {
        try (JammedTurkeyCage t1 = new JammedTurkeyCage();
                JammedTurkeyCage t2 = new JammedTurkeyCage()) {

            throw new IllegalStateException("turkeys ran off");

        } catch (IllegalStateException e) {
            System.out.println("caught: " + e.getMessage());
            for (Throwable t : e.getSuppressed()) {
                System.out.println("Supressed Exception: " + t.getMessage());
            }
        }
    }
}
