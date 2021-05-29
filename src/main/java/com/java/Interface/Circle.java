/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Interface;

/**
 *
 * @author djoshi
 */
public class Circle extends CircularShape{
    private int xPos, yPos, radius;
    
    public Circle(int x, int y, int r) {
        xPos = x;
        yPos = y;
        radius = r;
    }
    
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void roll(float degree) {
        System.out.printf("rolling circle by %.2f degrees", degree);
    }
    
    public static void main(String[] args){
        Circle circle = new Circle(10, 10, 20);
        circle.roll(45);
    }
}
