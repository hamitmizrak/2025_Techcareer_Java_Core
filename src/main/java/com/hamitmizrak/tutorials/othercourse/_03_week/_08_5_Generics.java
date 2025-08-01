package com.hamitmizrak.tutorials.othercourse._03_week;

// Bounded Generics (Generics Sınırlamalar)
// public class _08_4_Generics<T extends Number> {
public class _08_5_Generics<T extends String> {

    private String name;
    private T price;


    // METHOD
    public  <T> void printData(T number){
        System.out.println(number);
    }

    // GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getPrice() {
        return price;
    }

    public void setPrice(T price) {
        this.price = price;
    }


    // PSVM
    public static void main(String[] args) {
        _08_5_Generics generics = new _08_5_Generics();
        generics.setName("Hamit");
        generics.setPrice("44.0 TL");
        System.out.println(generics.getName()+" "+generics.getPrice());

        generics.printData(55);
        generics.printData("55");
        generics.printData(55.44);
    }
}

