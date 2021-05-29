/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.lambda.supplier;

import java.util.function.Supplier;

/**
 *
 * @author djoshi
 */
public class SupplierUse2 {

    public static void main(String args[]) {
        String t = "One";
        Supplier<String> supplierStr = () -> t.toUpperCase();
        System.out.println(supplierStr.get());
    }
}
