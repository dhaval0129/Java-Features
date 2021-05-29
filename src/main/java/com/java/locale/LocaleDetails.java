/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.Locale;

/**
 *
 * @author djoshi
 */
public class LocaleDetails {

    public static void main(String args[]) {
        Locale.setDefault(Locale.CANADA_FRENCH);
        Locale defaultLocale = Locale.getDefault();

        System.out.printf("The default locale is %s %n", defaultLocale);
        System.out.printf("The default language code is %s and the name is %s %n",
                defaultLocale.getLanguage(), defaultLocale.getDisplayLanguage());
        System.out.printf("The default country code is %s and the name is %s %n",
                defaultLocale.getCountry(), defaultLocale.getDisplayCountry());
        System.out.printf("The default variant code is %s and the name is %s %n", 
                defaultLocale.getVariant(), defaultLocale.getDisplayVariant());
    }
}
