/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparator;

import java.util.Comparator;

/**
 *
 * @author djoshi
 */
public class MultiFieldComparator implements Comparator<Squirrel> {

    // If two squirrels are from the species,
    // we want to sort the one that weighs the least first.
            
    @Override
    public int compare(Squirrel s1, Squirrel s2) {
        int result = s1.getSpecies().compareTo(s2.getSpecies());
        // if they are of different species then return result
        if (result != 0) {
            return result;
        }
        // ascending order by weight if squirrel are of same species
        return s1.getWeight() - s2.getWeight();
    }
}
