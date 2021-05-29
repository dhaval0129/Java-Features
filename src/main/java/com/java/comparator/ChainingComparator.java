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
public class ChainingComparator implements Comparator<Squirrel> {
    
    @Override
    public int compare(Squirrel s1, Squirrel s2) {
        Comparator<Squirrel> c = Comparator.comparing(s -> s.getSpecies());
        c = c.thenComparing(s -> s.getWeight());
        return c.compare(s1, s2);
    }
}
