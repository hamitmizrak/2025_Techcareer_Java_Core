package com.hamitmizrak.tutorials.javacore;

public class _05_2_Boxing_UnBoxing {

    /**
     */
    public static void main(String[] args) {

        // Autoboxing: Primitive Type To Wrapper type Change
        int primitiveType=100;
        System.out.println("Primitive Types: "+ primitiveType);

        Integer wrapperType= primitiveType;
        System.out.println("wrapper Types: "+wrapperType);

        // Unboxing: Wrapper Type => Primitive Type dönüştürmek
        Long wrapperUnBoxing=15L;
        long primitiveUnBoxing= wrapperUnBoxing;
        System.out.println(primitiveUnBoxing);

    }
}
