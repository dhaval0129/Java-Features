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
public class ResBundle_it_IT extends ListResourceBundle {

    @Override
    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
        {"MovieName", "Che Bella Giornata"},
        {"GrossRevenue", (Long) 43000000L}, // in euros
        {"Year", (Integer) 2011}
    };
}
