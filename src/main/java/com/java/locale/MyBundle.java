/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.ListResourceBundle;

/**
 *
 * @author djoshi
 */
public class MyBundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return new Object[][]{
            {"hi", "Hola"},
            {"number", new Integer(100)}
        };
    }
}
