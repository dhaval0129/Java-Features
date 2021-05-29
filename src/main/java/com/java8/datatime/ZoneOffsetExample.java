/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java8.datatime;

import java.time.Instant;
import java.time.ZoneOffset;

/**
 *
 * @author djoshi
 */
public class ZoneOffsetExample {
    
    public static void main(String args[]) {
        Instant ins = Instant.now();
        ZoneOffset india = ZoneOffset.ofHoursMinutes(5, 30);
        System.out.println(ins.atOffset(india));
    }
}
