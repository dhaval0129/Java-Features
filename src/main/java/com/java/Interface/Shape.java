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
abstract class Shape {

    abstract double area();

    private Shape parentShape;

    public void setParentShape(Shape shape) {
        parentShape = shape;
    }

    public Shape getParentShape() {
        return parentShape;
    }
}
