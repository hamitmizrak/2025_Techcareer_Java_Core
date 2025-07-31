package com.hamitmizrak.homework;


import com.hamitmizrak.SpecialColor;

import java.util.Random;
import java.util.Scanner;


// Book App
public class BookApp {

    // Scanner
    private static Scanner klavye = new Scanner(System.in);

    // Login
    public boolean logIn() {
        // Kullanıcıdan kullanıadı, şifre
        String kullaniciAdi, sifre, dbKullaniciAdi = "root", dbSifre = "root";

        System.out.println("\n" + SpecialColor.BLUE + "Kullanıcı adını yazınız" + SpecialColor.RESET);
        kullaniciAdi = klavye.nextLine();

        System.out.println(SpecialColor.BLUE + "Kullanıcı şifre yazınız" + SpecialColor.RESET);
        sifre = klavye.nextLine();

        // karar mercisi
        if (kullaniciAdi.equals(dbKullaniciAdi) && sifre.equals(dbSifre)) {
            System.out.println(SpecialColor.YELLOW + "bilgiler doğru admin sayfasına yönlendiriliyorsunuz" + SpecialColor.RESET);
        } else {
            System.out.println(SpecialColor.RED + "kullanıcı adı veya şifreyi yanlış girdiniz" + SpecialColor.RESET);
            logIn();
        }
        return true;
    }

    // Logout
    public void logout() {
        System.out.println("Hatalı seçim");
    }

    // all book
    public void allBook() {

        //Dizi(array)
        _3_Book[] libraries = new _3_Book[5];
        int bookCounter = 0;

        // Login oldu mu?
        boolean isContinue = logIn();
        //System.out.println(isContinue);
        try {
            while (isContinue) {
                System.out.println("\nKİTAP YÖNETİM UYGULAMASI");
                System.out.println("1-Kitap Ekle");
                System.out.println("2-Kitap Listele");
                System.out.println("3-Kitap Ara");
                System.out.println("4-Çıkış");
                System.out.println("Seçiminiz");

                int chooise = klavye.nextInt();
                klavye.nextLine(); //dumppy enter

                // switch
                switch (chooise) {
                    // KİTAP EKLE
                    case 1 -> {
                        System.out.println("Kitap Ekle");
                        if (bookCounter == libraries.length) {
                            System.out.println("Dizi dolu, yeni kitap ekleyemezsiniz");
                        } else {
                            System.out.print(SpecialColor.YELLOW+"Kitap adı: "+SpecialColor.RESET);
                            String bookName = klavye.nextLine();

                            System.out.print(SpecialColor.YELLOW+"Kitap yazarı: "+SpecialColor.RESET);
                            String bookWriter = klavye.nextLine();

                            System.out.print(SpecialColor.YELLOW+"Kitap Türü seçin 0-ROMAN, 1-BİLİM, 2- TARİH, 3-TEKNOLOJI, 4-DİĞER : "+SpecialColor.RESET);
                            int typeIndex = klavye.nextInt();
                            _2_BookTypes bookTypes = _2_BookTypes.values()[typeIndex];

                            // Id otomatik artın
                            libraries[bookCounter] = new _3_Book(bookCounter + 1, bookName, bookWriter, bookTypes);
                            bookCounter++;
                            System.out.println("Kitap eklendi");
                        }
                    }

                    // KİTAP LISTESI
                    case 2 -> {
                        // Iterative for
                        for (int i = 0; i < bookCounter; i++) {
                            libraries[i].informationWrite();
                        }
                    }

                    // KİTAP ARA
                    case 3 -> {
                        System.out.print(SpecialColor.YELLOW+"Aranacak kitap: "+SpecialColor.RESET);
                        String aranan = klavye.nextLine();
                        boolean isBook = false;
                        for (int i = 0; i < bookCounter; i++) {
                            if (libraries[i].getBookName().equalsIgnoreCase(aranan)) {
                                libraries[i].informationWrite();
                                isBook = true;
                                break;
                            }
                        } // end for
                        try {
                            if (!isBook) // kitap yoksa
                                throw new _1_NotFoundBooklException("Kitap bulunamadı " + aranan);
                        } catch (_1_NotFoundBooklException notFoundBooklException) {
                            System.out.println(SpecialColor.RED + notFoundBooklException.getMessage() + SpecialColor.RESET);
                        }
                    }

                    // ÇIKIŞ
                    case 4 -> {
                        System.out.println("Çıkılış yapılıyor");
                        System.exit(0);
                    }
                    default -> logout();
                } //end switch

                // Wrapper/Math/Random örneği
                Integer toplamKitap = bookCounter;// wrapper
                System.out.println("Toplam Kitap sayısı: " + toplamKitap);
                System.out.println("Random index(0-" + (bookCounter - 1) + "):" + new Random().nextInt(Math.max(1, bookCounter)));
            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    // PSVM
    public static void main(String[] args) {
        BookApp bookApp = new BookApp();
        bookApp.allBook();
    }
} //end BookApp
