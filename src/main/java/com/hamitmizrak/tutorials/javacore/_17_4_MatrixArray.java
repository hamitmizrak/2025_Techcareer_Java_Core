package com.hamitmizrak.tutorials.javacore;


import com.hamitmizrak.SpecialColor;

public class _17_4_MatrixArray {

    // static
    private static int counter =0;

    public static void main(String[] args) {
        // Matrix
        int[][] matrix= new int[3][3]; //ilk 3:satır, sonraki:3, sutun 3*3 = 9
        matrix[0][0]=1;
        matrix[0][1]=2;
        matrix[0][2]=3;
        matrix[1][0]=4;
        matrix[1][1]=5;
        matrix[1][2]=6;
        matrix[2][0]=7;
        matrix[2][1]=8;
        matrix[2][2]=9;

        // Klasik for Döngüsü (Iterative)
        System.out.println("\n" + SpecialColor.YELLOW + "Klasik for Döngüsü (Iterative)" + SpecialColor.RESET);
        for (int i = 0; i <matrix.length ; i++) { // Satır
            for (int j = 0; j <matrix[i].length ; j++) { // Sutun
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(); // satır sonu
        }

        // for-each isimsel (enhanced for Loop)
        System.out.println("\n" + SpecialColor.YELLOW + "for-each isimsel (enhanced for Loop)" + SpecialColor.RESET);
        for(int[] satir : matrix){
            for(int eleman : satir){
                System.out.print(eleman+" ");
            }
            System.out.println();
        }

        System.out.println("\n"+SpecialColor.BLUE+"3 boyutlu dizi örneği"+SpecialColor.RESET);
        // 3 lü for  10*10*10 = 1000
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    counter++;
                    System.out.println("sayac: "+counter+" : data");
                }
            }
        }
        System.out.println("Toplam Döngü sayısı: "+counter);
    }
}
