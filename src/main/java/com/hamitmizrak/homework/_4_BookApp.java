package com.hamitmizrak.homework;


import com.hamitmizrak.SpecialColor;

import java.util.Scanner;


// Book App

public class _4_BookApp {

    // Field
    private static final int MAX_SIZE = 10; // Dizide maksimum kitap sayısı
    private static final _3_Book[] library = new _3_Book[MAX_SIZE];
    private static int bookCount = 0;
    private static final Scanner klavye = new Scanner(System.in);

    // Method
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
            mainData();
        } else {
            System.out.println(SpecialColor.RED + "kullanıcı adı veya şifreyi yanlış girdiniz" + SpecialColor.RESET);
            logIn();
        }
        return true;
    }

    // Logout
    public void logout() {
        System.out.println("Çıkış yapılıyor");
        System.exit(0);
    }

    // mainData Method
    public void mainData() {
        for (; ; ) {
            // Chooise
            printMenu();
            int choice = klavye.nextInt();
            klavye.nextLine(); // Enter tuşunu temizlemek için

            switch (choice) {
                case 1 -> addBook();
                case 2 -> listBooks();
                case 3 -> searchBook();
                case 4 -> deleteBook();
                case 5 -> updateBook();
                case 6 -> sortBooksByTitle();
                case 7 -> report();
                case 0 -> {
                    logout();
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }


    /* Menü yazdırma metodu*/
    private void printMenu() {
        try {
            System.out.println("\n==== BOOK MANAGEMENT SYSTEM ====");
            System.out.println(SpecialColor.BLUE + "1- Kitap Ekle");
            System.out.println("2- Kitap Listele");
            System.out.println("3- Kitap Ara");
            System.out.println("4- Kitap Sil");
            System.out.println("5- Kitap Güncelle");
            System.out.println("6- Kitap adına göre sırala");
            System.out.println("7- Rapor");
            System.out.println("0- Çıkış" + SpecialColor.RESET);
            System.out.print("Seçiminiz: ");
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }


    /* Yeni kitap ekleme metodu*/
    private void addBook() {
        if (bookCount == MAX_SIZE) {
            System.out.println("Array is full. Cannot add more books.");
            return;
        }
        System.out.print(SpecialColor.YELLOW+"Kitap adı: "+SpecialColor.RESET);
        String title = klavye.nextLine();
        System.out.print(SpecialColor.YELLOW+"Kitap yazarı: "+SpecialColor.RESET);
        String author = klavye.nextLine();
        System.out.print(SpecialColor.YELLOW+"Kitap sayfası: "+SpecialColor.RESET);
        int pages = klavye.nextInt();
        System.out.print(SpecialColor.YELLOW+"Kitap Türü: 0-ROMAN 1-BILIM 2-TARIH 3-TEKNOLOJI 4-Diğer"+SpecialColor.RESET);
        int typeIndex = klavye.nextInt();
        klavye.nextLine();

        library[bookCount] = new _3_Book(bookCount + 1, title, author, _2_BookTypes.values()[typeIndex], pages);
        bookCount++;
        System.out.println("Kitap eklendi.");
    }


    /* Tüm kitapları listeleme metodu */
    private void listBooks() {
        if (bookCount == 0) {
            System.out.println("Kitaplık boş");
            return;
        }
        for (int i = 0; i < bookCount; i++) {
            library[i].printInfo();
        }
    }


    /* ID ile kitap indexi bulma (yardımcı metot) */
    private int findBookIndexById(int id) {
        for (int i = 0; i < bookCount; i++) {
            if (library[i].getId() == id) return i;
        }
        return -1;
    }


    /*Kitap arama metodu (isim bazlı)*/
    private void searchBook() {
        System.out.print(SpecialColor.BLUE+"Kitap adını Giriniz: "+SpecialColor.RESET);
        String keyword = klavye.nextLine();
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (library[i].getTitle().equalsIgnoreCase(keyword)) {
                library[i].printInfo();
                found = true;
            }
        }
        if (!found)
            System.out.println("No book found with title: " + keyword);
    }

    /**
     * Kitapları başlığa göre sıralama metodu (Bubble sort ile)
     */
    private void sortBooksByTitle() {
        for (int i = 0; i < bookCount - 1; i++) {
            for (int j = i + 1; j < bookCount; j++) {
                if (library[i].getTitle().compareToIgnoreCase(library[j].getTitle()) > 0) {
                    _3_Book temp = library[i];
                    library[i] = library[j];
                    library[j] = temp;
                }
            }
        }
        System.out.println("Books sorted by title.");
    }


    /*Kitap silme metodu */
    private void deleteBook() {
        listBooks();
        System.out.print(SpecialColor.YELLOW+"Silinecek Kitap ID giriniz "+SpecialColor.RESET);
        int id= klavye.nextInt();
        int index = findBookIndexById(id);
        if(index==-1){
            System.out.println("Kitap bulunamadı");
            return;
        }

        // Silinen elemandan sonrası kaydırma
        for (int i = index; i <bookCount-1 ; i++) {
            library[i]=library[i+1];
            bookCount--;
            System.out.println("Kitap Silindi");
        }

    }

    /*Kitap bilgilerini güncelleme metodu*/
    private void updateBook() {
        listBooks();
        System.out.print(SpecialColor.YELLOW+"Güncelemek istediğiniz Kitap ID giriniz "+SpecialColor.RESET);
        int id= klavye.nextInt();
        klavye.nextLine(); // dummpy enter

        int index = findBookIndexById(id);
        if(index==-1){
            System.out.println("Kitap bulunamadı");
            return;
        }

        System.out.print(SpecialColor.YELLOW+"güncellenecek Kitap adı: "+SpecialColor.RESET);
        String title = klavye.nextLine();

        System.out.print(SpecialColor.YELLOW+"güncellenecek Kitap yazarı: "+SpecialColor.RESET);
        String author = klavye.nextLine();

        System.out.print(SpecialColor.YELLOW+"güncellenecek Kitap sayfası: "+SpecialColor.RESET);
        int pages = klavye.nextInt();

        System.out.print(SpecialColor.YELLOW+"güncellenecek Kitap Türü: 0-ROMAN 1-BILIM 2-TARIH 3-TEKNOLOJI 4-Diğer"+SpecialColor.RESET);
        int typeIndex = klavye.nextInt();
        klavye.nextLine();

        //
        library[index].setTitle(title);
        library[index].setAuthor(author);
        library[index].setPages(pages);
        library[index].setBookTypes(_2_BookTypes.BILIM);
    }

    /* Raporlama metodu */
    private void report() {
        System.out.println("Total number of books: " + bookCount);
        if (bookCount == 0) return;

        // En fazla sayfalı kitabı bul
        _3_Book max = library[0];
        for (int i = 1; i < bookCount; i++) {
            if (library[i].getPages() > max.getPages()) {
                max = library[i];
            }
        }
        System.out.println("Book with the most pages: " + max.getTitle() + " (" + max.getPages() + " pages)");
    }
}//end BookApp
