/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author djoshi
 */
public class Product implements Comparable<Product> {

    private int id;
    private String name;

    @Override
    public String toString() {
        return name;
    }

    private Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Product)) {
            return false;
        }

        Product other = (Product) obj;
        return this.id == other.id;
    }

    @Override
    public int compareTo(Product p) {
        return this.name.compareTo(p.name);
    }

    public static void main(String args[]) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(10, "Table"));
        products.add(new Product(20, "Chair"));
        products.add(new Product(10, "Teapoy"));
        Collections.sort(products);
        System.out.println(products);
    }
}
