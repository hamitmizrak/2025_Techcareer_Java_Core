package com.hamitmizrak;

import java.util.Scanner;

public class _08_3_Scanner {

    /**
     String sonra Sayı gelirse normal akış devam eder.
      */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tam sayı arkasında String bir klavye çağırırsak dar boğaz olur.
        System.out.println("\nLütfen bir sayı giriniz");
        int numberData = scanner.nextInt();
        System.out.println("Girdiğiniz Sayı: "+numberData);

        // dummp escape ==> (Boşluğu almak)
        scanner.nextLine();

        System.out.println("\nLütfen adınızı giriniz");
        String name = scanner.nextLine();
        System.out.println("Adınız: "+name);

        // Scanner close
        scanner.close();
    }
}
