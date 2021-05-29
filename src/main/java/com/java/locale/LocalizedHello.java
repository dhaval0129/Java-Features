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
public class LocalizedHello {

    public static void main(String args[]) {
        Locale currentLocale = Locale.getDefault();
        currentLocale.setDefault(Locale.ITALY);
        ResourceBundle resBundle = ResourceBundle.getBundle("ResourceBundle", currentLocale);
        System.out.printf(resBundle.getString("Greeting"));
    }
}
