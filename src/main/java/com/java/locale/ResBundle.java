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
public class ResBundle extends ListResourceBundle {

    @Override
    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
        {"MovieName", "Avatar"},
        {"GrossRevenue", (Long) 2782275172L}, // in US dollars
        {"Year", (Integer) 2009}
    };
}
