/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.Arrays;
import java.util.Locale;

/**
 *
 * @author djoshi
 */
public class AvailableLocales {

    public static void main(String args[]) {
        System.out.println("The default locale is: " + Locale.getDefault());
        Locale[] locales = Locale.getAvailableLocales();
        System.out.printf("No. of othr availble locales is: %d, and they are: %n", locales.length);

        Arrays.stream(locales).forEach(
                locale -> System.out.printf("Locale code: %s and it stands for %s %n",
                        locale, locale.getDisplayName()));
    }
}
