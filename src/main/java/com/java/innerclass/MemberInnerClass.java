/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.innerclass;

/**
 *
 * @author djoshi
 */
class Circle {

    // Member Inner class
    class Point {

        private int xPos;
        private int yPos;

        public Point(int x, int y) {
            xPos = x;
            yPos = y;
        }

        @Override
        public String toString() {
            return "(" + xPos + "," + yPos + ")";
        }
    }

    private Point center;
    private int radius;

    public Circle(int x, int y, int r) {
        center = this.new Point(x, y);
        radius = r;
    }

    @Override
    public String toString() {
        return "mid point = " + center + " and radius = " + radius;
    }
}

public class MemberInnerClass {

    public static void main(String args[]) {
        // X , Y points and Radius r;
        System.out.println(new Circle(10, 10, 20));
    }
}
