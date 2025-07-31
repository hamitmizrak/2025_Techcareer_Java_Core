package com.hamitmizrak.homework;


import lombok.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

// 1- Enum: Kitap Türleri
enum KitapTuru{
    ROMAN,BILIM,TARIH,TEKNOLOJI,DIGER
}


// 2- Kitap Class
@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder
class Kitap {
    // Field
    private int id;
    private String ad;
    private String yazar;
    private KitapTuru tur;
    private LocalDate eklenmeTarihi;

    // Constructor (parametresiz)
    public Kitap() {
    }

    // Constructor (parametreli)
    public Kitap(int id, String ad, String yazar, KitapTuru tur) {
        this.id = id;
        this.ad = ad;
        this.yazar = yazar;
        this.tur = tur;
        this.eklenmeTarihi=LocalDate.now();
    }

    // Method
    public void bilgileriYazdir(){
        System.out.printf("ID: %d | %s - %s (%s) [%s]%n",
                id,ad,yazar,tur,eklenmeTarihi.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
    }

    // Getter And Setter

} // end Kitap

// 3- Customise Exception : Kitap bulunmazsa
class KitapBulunamadiException extends Exception{

    // parametresiz constructor
    public KitapBulunamadiException(String message) {
        super(message);
    }
} //end KitapBulunamadiException


// Book App
public class BookApp {

    // Scanner
    private static Scanner scanner = new Scanner(System.in);

    // Login
    public boolean girisYap(){
        // Kullanıcıdan kullanıadı, şifre
        return true;
    }

    // 4- Method
    public void allBookMethod(){

        //Dizi(array)
        Kitap[] kutuphane = new Kitap[5];
        int kitapSayisi=0;

        // Login oldu mu?
        boolean devam= girisYap();
        try{
            while(devam){
                System.out.println("\nKİTAP YÖNETİM UYGULAMASI");
                System.out.println("1-Kitap Ekle");
                System.out.println("2-Kitap Listele");
                System.out.println("3-Kitap Ara");
                System.out.println("4-Çıkış");
                System.out.println("Seçiminiz");

                int secim= scanner.nextInt();
                scanner.nextLine(); //dumppy enter

                // switch
                switch (secim){
                    case 1 ->{
                        System.out.println("Kitap Ekle");
                        if(kitapSayisi==kutuphane.length){
                            System.out.println("Dizi dolu, yeni kitap ekleyemezsiniz");
                        }else{
                            System.out.println("Kitap adı");
                            String yazar = scanner.nextLine();

                            System.out.println("Kitap yazarı");
                            String ad = scanner.nextLine();

                            System.out.println("Kitap Türü seçin 0-ROMAN, 1-BİLİM, 2- TARİH, 3-TEKNOLOJI, 4-DİĞER");
                            int turIndex = scanner.nextInt();
                            KitapTuru kitapTuru=KitapTuru.values()[turIndex];

                            // Id otomatik artın
                            kutuphane[kitapSayisi] = new Kitap(kitapSayisi+1,ad,yazar,kitapTuru);
                            kitapSayisi++;
                            System.out.println("Kitap eklendi");
                        }
                    }
                    case 2 ->{}
                    case 3 ->{}
                    case 4 ->{}
                    default -> System.out.println("Hatalı seçim");
                } //end switch

                // Wrapper/Math/Random örneği
                Integer toplamKitap= kitapSayisi;// wrapper
                System.out.println("Toplam Kitap sayısı: "+toplamKitap);
                System.out.println("Random index(0-"+(kitapSayisi-1)+"):"+ new Random().nextInt(Math.max(1,kitapSayisi)));
            }


        }catch (Exception exception){
            exception.printStackTrace();
        }
    }

} //end BookApp
