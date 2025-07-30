package com.hamitmizrak;

import java.util.Formatter;

public class _09_3_Formatter {
    public static void main(String[] args) {

        // import java.util.Formatter;
        String str="Hamit";
        int decimal=13;
        float floatingPoint=14.53f;
        Formatter formatter = new Formatter();
        formatter.format("Merhaba %s, deneyim %d tarih: %2.3f",str ,decimal,floatingPoint);
        System.out.println(formatter);
        formatter.close();
    }
}
