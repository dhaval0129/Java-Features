/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.java.Enum;

/**
 *
 * @author djoshi
 */
public class EnumTest {

    PrinterType printerType;

    public EnumTest(PrinterType pType) {
        printerType = pType;
    }

    public void feature() {
        // switch based on the printer type passed in the constructor
        switch (printerType) {
            case DOTMATRIX:
                System.out.println("Dot-Matrix printers are economical and amlmost obsolete");
                break;

            case INKJET:
                System.out.println("Inkjet printers provide decent quality prints");
                break;
            case LASER:
                System.out.println("Laser printer provides best quality prints");
                break;
        }

        System.out.println("Print page capacity per minute: " + printerType.getPrintPageCapacity());
    }

    public static void main(String args[]) {
        EnumTest enumTest = new EnumTest(PrinterType.LASER);
        enumTest.feature();
    }
}
