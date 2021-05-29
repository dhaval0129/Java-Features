/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author djoshi
 *
 * example from Enthuware
 *
 */
public class LocaleExample {

    public static void main(String args[]) {   
        Locale myloc = new Locale.Builder()
                .setLanguage("en").setRegion("UK").build();
        ResourceBundle msgs = ResourceBundle.getBundle("MyMsgs", myloc);
        Enumeration<String> en = msgs.getKeys();

        while (en.hasMoreElements()) {
            String key = en.nextElement();
            String val = msgs.getString(key);
            System.out.println(key + " : " + val);
        }
    }
}
