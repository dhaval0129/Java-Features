/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author djoshi
 */
public class GenericExample2 {

    public static void main(String args[]) {
        List<? super Number> list = new ArrayList<Object>();
        list.add(new Integer(2));
//        list.add(new Object());

        List<Integer> listInteger = new ArrayList<>();
        List<Object> listObject = new ArrayList<>();
        List<? super Number> listSuperNum = new ArrayList<>();
        listSuperNum.add(new Integer(1));
        listSuperNum.add(new Float(1.0F));

//        listSuperNum = listInteger;
        listSuperNum = listObject;

        List<Float> listFloat = new ArrayList<>();
        List<Number> listNumber = new ArrayList<>();
        listNumber.add(new Integer(1)); // OK
        listNumber.add(new Float(1.0F)); // OK
//        listNumber = listInteger; // Error
//        listNumber = listFloat; // Error
        
        List<? extends Number> listExtendsNum = new ArrayList<>();
        // This would cause an error
        // listExtendsNum.add(new Integer(1));
        listExtendsNum = listInteger; // OK
        listExtendsNum = listFloat; // OK
    }
}
