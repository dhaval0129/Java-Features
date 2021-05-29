/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.generics;

import java.util.List;

/**
 *
 * @author djoshi
 */
class Booby {
}

class Dooby extends Booby {
}

class Tooby extends Dooby {
}

// Note in Generics there is difference between add and assign 
public class LBAndUBExample {
    Booby b = new Booby();
    Tooby t = new Tooby();
//    Dooby d = new Dooby();

    public void addData1(List<? super Dooby> dataList) {
        dataList.add(t);
//        dataList.add(d);
        // super lets you add the value
        // since compiler does not know what type dataList is we can
        // either add Dooby or its subclass
    }
    
    public void addData2(List<? extends Dooby> dataList) {
        b = dataList.get(0);
//        d = dataList.get(0);
        // extends lets you get the value
        // since compiler does not know what type dataList is we can 
        // only get Dobby or its super class
    }
}
