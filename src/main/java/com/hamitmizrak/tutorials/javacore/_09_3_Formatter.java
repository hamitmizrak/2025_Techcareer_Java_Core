package com.hamitmizrak.tutorials.javacore;

import java.util.Formatter;

public class _09_3_Formatter {
    public static void main(String[] args) {

        // import java.util.Formatter;
        String str="Hamit";
        int decimal=13;
        float floatingPoint=14.53f;

        // printf
        // Ek bir nesne oluşturmaz.
        // printf kullanımı (Formatter ile aynı format)
        System.out.printf("Merhaba %s, deneyim %d tarih: %2.3f%n", str, decimal, floatingPoint);

        // Formatter
        // Bir Formatter nesnesi oluşturur (bellekte çalışır)
        // Formatlanmış metni bellekte tutar.
        Formatter formatter = new Formatter();
        formatter.format("Merhaba %s, deneyim %d tarih: %2.3f",str ,decimal,floatingPoint);
        System.out.println(formatter);
        formatter.close();
    }
}
