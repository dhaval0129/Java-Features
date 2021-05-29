/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Enum;

/**
 *
 * @author djoshi
 */
public enum Volume {
    HIGH(100) {
        @Override
        public void printValue() {
            System.out.println("** Highest value**");
        }

        @Override
        public void printDescription() {
            System.out.println("High Volume");
        }
    }, MEDIUM(50) {
        @Override
        public void printDescription() {
            System.out.println("Medium Volume");
        }
    }, LOW(20) {
        @Override
        public void printDescription() {
            System.out.println("Low Volume");
        }
    };
    private int value;

    private Volume(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(value);
    }

    public abstract void printDescription();
}
