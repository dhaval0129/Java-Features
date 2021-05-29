/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author djoshi
 */
public class Type extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{{"keys", new ArrayList<>()}};
    }

    public static void main(String args[]) {
        Locale currentLocale = new Locale("en", "US");
        ResourceBundle rb = ResourceBundle.getBundle("com.java.locale.Type", currentLocale);
        List<String> keys = (List) rb.getObject("keys");
        keys.add("q");
        keys.add("w");
        keys.add("e");
        keys.add("r");
        keys.add("t");
        keys.add("y");
        System.out.println(((List) rb.getObject("keys")).size());
    }
}
