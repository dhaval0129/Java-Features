/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.ListResourceBundle;
import java.util.ResourceBundle;

/**
 *
 * @author djoshi
 */
public class PropertyCounter extends ListResourceBundle {

    private int count = 0;

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"count", new PropertyCounter()}};
    }

    public int getCount() {
        return count++;
    }

    public static void main(String args[]) {
        ResourceBundle rb = ResourceBundle.getBundle("com.java.locale.PropertyCounter");
        PropertyCounter obj = (PropertyCounter) rb.getObject("count");
        System.out.println(obj.getCount() + " " + obj.getCount());
    }
}
