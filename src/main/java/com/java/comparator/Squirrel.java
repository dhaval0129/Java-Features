/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparator;

/**
 *
 * @author djoshi
 */
public class Squirrel {

    private int weight;
    private String species;

    public Squirrel(String species) {
        if (species == null) {
            throw new IllegalArgumentException();
        }
        this.species = species;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
