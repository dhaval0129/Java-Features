/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.locale;

import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author djoshi
 */

// Extend ResourceBundle.Control and override getCandidateLocales method
// to get the list of candidate locales that Java searches for
class TalkativeResourceBundleControl extends ResourceBundle.Control {
    // override the default getCandidateLocales method to print
    // the candidate locales first
    @Override
    public List<Locale> getCandidateLocales(String baseName, Locale locale) {
        List<Locale> candidateLocales = super.getCandidateLocales(baseName, locale);
        System.out.printf("Candidate locales for base bundle name %s and locale %s %n",
                baseName, locale.getDisplayName());
        candidateLocales.forEach(System.out::println);
        return candidateLocales;
    }
}

public class CandidateLocales {

    public static void loadResourceBundle(String resourceBundleName, Locale locale) {
        // Pass an instance of TalkativeResourceBundleControl to print candidate locales
        ResourceBundle resourceBundle = ResourceBundle.getBundle(resourceBundleName,
                locale, new TalkativeResourceBundleControl());
        String rbLocaleName = resourceBundle.getLocale().toString();
        // if the resource bundle local name is empty it means default property file
        if (rbLocaleName.equals("")) {
            System.out.println("Loaded the default property file with name: "
                    + resourceBundleName);
        } else {
            System.out.println("Loaded the resource bundle for the locale: "
                    + resourceBundleName + "." + rbLocaleName);
        }
    }

    public static void main(String args[]) {
//        loadResourceBundle("ResourceBundle", new Locale("hi", "IN", "Delhi"));
        loadResourceBundle("ResourceBundle", new Locale("fr", "CA", "Toronto"));
    }
}
