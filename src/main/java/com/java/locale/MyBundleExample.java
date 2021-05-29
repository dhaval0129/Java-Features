/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author djoshi
 */
public class MyBundleExample {

    public static void main(String args[]) {
        Locale spain = new Locale("es", "ES");
        Locale spanish = new Locale("es");

        ResourceBundle rb = ResourceBundle.getBundle("com.java.locale.MyBundle", spain);
        System.out.format("%s %s\n", rb.getString("hi"), rb.getString("s"));

        rb = ResourceBundle.getBundle("com.java.locale.MyBundle", spanish);
        System.out.format("%s %s\n", rb.getString("hi"), rb.getString("s"));
    }
}
