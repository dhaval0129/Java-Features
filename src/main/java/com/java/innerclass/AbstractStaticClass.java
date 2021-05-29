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
abstract class Shape {

    public static class Color {

        int m_red, m_green, m_blue;

        Color() {
            this(0, 0, 0);
        }

        public Color(int red, int green, int blue) {
            m_red = red;
            m_green = green;
            m_blue = blue;
        }

        @Override
        public String toString() {
            return " red = " + m_red + " green = " + m_green + " blue = " + m_blue;
        }
    }
}

public class AbstractStaticClass {

    public static void main(String args[]) {
        Shape.Color white = new Shape.Color(255, 255, 255);
        System.out.println("White color has values: " + white);
    }
}
