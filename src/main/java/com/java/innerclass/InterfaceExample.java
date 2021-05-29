/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.innerclass;

/**
 *
 * @author djoshi
 */
interface House {

    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Office {

    public static String getAddress() {
        return "101 Smart Str";
    }
}

interface WFH extends House, Office {
}

class HomeOffice implements House, Office {

    @Override
    public String getAddress() {
        return "R No 1, Home";
    }
}

public class InterfaceExample {

    public static void main(String[] args) {
        HomeOffice off = new HomeOffice();  //1     
        System.out.println(Office.getAddress()); //2   
    } 
}
