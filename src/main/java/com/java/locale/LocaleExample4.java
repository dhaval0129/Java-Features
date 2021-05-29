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
public class LocaleExample4 {

    public static void main(String args[]) {
        Locale locale = new Locale("", "");
        ResourceBundle rb = ResourceBundle.getBundle("Bundle1", locale);
        System.out.println(rb.getString("key1"));
        
//        Even though the program creates an invalid Locale object, it does not 
//        throw any exception. When Java looks up a resource bundle with that locale, 
//        it can find any so it resolves to the default bundle (Bundle1.properties).
    }
}
