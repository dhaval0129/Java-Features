/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

/**
 *
 * @author djoshi
 */
public class LocaleExample3 {

    public static void main(String args[]) {
        Locale spain = new Locale("es", "ES");
        Locale spanish = new Locale("es");

        ResourceBundle rb = ResourceBundle.getBundle("MyBundle", spain);
        System.out.format("%s %s\n", rb.getString("hi"), rb.getString("s"));

        rb = ResourceBundle.getBundle("MyBundle", spanish);
        System.out.format("%s %s\n", rb.getString("hi"), rb.getString("s"));

        // no resource bundle specified. It will take default bundle
        rb = ResourceBundle.getBundle("MyBundle");
        System.out.format("%s %s\n", rb.getString("hi"), rb.getString("s"));

        ResourceBundle r = ResourceBundle.getBundle("MyBundle");
        Set<String> keys = r.keySet();
        keys.stream()
            .forEach(key -> 
                System.out.format("%s %s\n", key, r.getString(key)));
    }
}
