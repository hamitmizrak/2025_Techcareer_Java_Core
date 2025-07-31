package com.hamitmizrak.tutorials.javacore;

public class _13_1_Loop_for_while_dowhile {

    public static void forLoop() {
        // i++   ==>  1 artır
        // i=i+1 ==>  1 artır
        // i+=1  ==>  1 artır

        // i++  = önce işlem yap sonra artır
        // ++i  = önce 1 artır sonra işlem
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }

    public static void whileLoop() {
        int i = 1; // başlangıç
        while (i <= 10) {
            System.out.print(i + " ");
            i++; // artırmak
        }
    }

    public static void doWhileLoop() {
        // şart sağlansın yada sağlanmasın en az 1 kere çalışır.
        int i = 1;
        do{
            System.out.print(i + " ");
            i++;
        }while (i <= 10);
    }

    // PSVM
    public static void main(String[] args) {
        forLoop();
        System.out.println();
        whileLoop();
        System.out.println();
        doWhileLoop();
    }

    // Array for each
    // Java 8 gelen forEach
}
