/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.exception;

/**
 *
 * @author djoshi
 */
class InvalidInputException extends RuntimeException {
    // default constructor
    public InvalidInputException() {
        super();
    }
    
    // constructor that takes the String detailed information we pass while
    // raising an exception
    public InvalidInputException(String str) {
        super(str);
    }
    
    // constructor that remembers the cause of the exception and
    // throws the new exception
    public InvalidInputException(Throwable originalException) {
        super(originalException);
    }
    
    // first argument takes detailed information string created while
    // raising an exception
    // and the second argument is to remember the cause of the exception
    public InvalidInputException(String str, Throwable originalException) {
        super(str, originalException);
    }
}
