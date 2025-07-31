package com.hamitmizrak.homework;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// 2- Kitap Class
@Getter
@Setter
//@NoArgsConstructor
@AllArgsConstructor
@Builder
public class _3_Book {
    // Field
    private int id;
    private String title;
    private String author;
    private _2_BookTypes bookTypes;
    private int pages; // Kitap sayfa sayısı
    private LocalDate createdDate;

    // Constructor (parametresiz)
    public _3_Book() {
    }

    // Constructor (parametreli)
    public _3_Book(int id, String title, String author, _2_BookTypes bookType, int pages) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.bookTypes = bookType;
        this.createdDate =LocalDate.now();
    }

    // Kitap bilgilerini yazdıran metod
    public void printInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.printf("ID:%d | %s - %s (%s, %d pages) [%s]%n",
                id, title, author, bookTypes, pages, createdDate.format(formatter));
    }

    // Getter And Setter

} // end Kitap
