package com.hamitmizrak;

public class _18_2_0_Class {
    // Field
    private String name;

    // Constructor (Kurucu method)
    public _18_2_0_Class() {
    }

    public _18_2_0_Class(String name) {
        this.name = name;
    }


    // method
    public void fullName() {
        System.out.println(this.name);
        System.out.println(name);
    }

    // Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // PSVM
    public static void main(String[] args) {
        _18_2_0_Class deneme= new _18_2_0_Class();
        deneme.setName("Hamit Mızrak");
        deneme.fullName();
    }
}
