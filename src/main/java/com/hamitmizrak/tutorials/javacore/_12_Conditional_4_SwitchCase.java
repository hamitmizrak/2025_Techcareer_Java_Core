package com.hamitmizrak.tutorials.javacore;

public class _12_Conditional_4_SwitchCase {

    // Klasik if, else if, else
    public static void classicIfElseCondition(int number) {
        if (number == 0) {
            System.out.println("Sayı sıfır");
        } else if (number == 1) {
            System.out.println("Sayı 1");
        } else if (number == 2) {
            System.out.println("Sayı 2");
        } else if (number == 3) {
            System.out.println("Sayı 3");
        } else if (number == 4) {
            System.out.println("Sayı 4");
        } else if (number == 5) {
            System.out.println("Sayı 5");
        } else {
            System.out.println("Sayı 0<=X<=5 dışında");
        }
    }

    // Switch case
    // normal if,elseif 'e göre daha hızlı çalışır.
    public static void switchCaseCondition(int number) {
        switch (number){
            case 0:
                System.out.println("Sayı sıfır");
                break;
            case 1:
                System.out.println("Sayı 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break;
            case 3:
                System.out.println("Sayı 3");
                break;
            case 4:
                System.out.println("Sayı 4");
                break;
            case 5:
                System.out.println("Sayı 5");
                break;
            default:
                System.out.println("Sayı 0<=X<=5 dışında");
                break;
        }
    }

    // Java 14+ ile birlikte gelen switch expression (yani rule‑based switch) kullanarak
    // aynı örneği daha modern ve kısa bir şekilde yazabilirsin.
    // Ne değişti?
    // -> (arrow) kullanılıyor.
    // Artık break yazmaya gerek yok.
    // Her case otomatik sonlanır.
    // Kod daha okunaklı ve kısa.
    public static void ruleBasedSwitchconditional(int number) {
        // Java 14+ switch expression (arrow syntax)
        switch (number) {
            case 0 -> System.out.println("Sayı sıfır");
            case 1 -> {System.out.println("Sayı 1");}
            case 2 -> System.out.println("Sayı 2");
            case 3 -> System.out.println("Sayı 3");
            case 4 -> System.out.println("Sayı 4");
            case 5 -> System.out.println("Sayı 5");
            default -> System.out.println("Sayı 0<=X<=5 dışında");
        }
    }


    // PSVM
    public static void main(String[] args) {
        int number = 5;
        classicIfElseCondition(number);
        switchCaseCondition(number);
        ruleBasedSwitchconditional(number);
    }
}
