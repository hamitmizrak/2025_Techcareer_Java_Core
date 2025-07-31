package com.hamitmizrak.tutorials.javacore;

import java.util.Random;

public class _07_Random {

    public static void main(String[] args) {

        // Math.random (Primitive type) ==> public static double random()
        double mathRandom = Math.random() * 5 + 1;  // 1 <= SAYI <=5
        System.out.println(mathRandom);

        // Math
        System.out.println("Math: "+ Math.floor(mathRandom)  );

        // Cast
        int mathRandom2 = (int) (Math.random() * 5 + 1); // 1 <= SAYI <=5
        System.out.println(mathRandom2);

        // Random Class
        Random rnd= new Random();
        int randomPrimitive= rnd.nextInt(5)+1; // 1 <= SAYI <=5
        System.out.println(randomPrimitive);

        int randomWarpper= rnd.nextInt(5)+1;
        System.out.println(randomWarpper);
    }
}
