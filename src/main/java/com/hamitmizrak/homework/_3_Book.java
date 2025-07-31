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
    private String bookName;
    private String bookWriter;
    private _2_BookTypes bookTypes;
    private LocalDate createdDate;

    // Constructor (parametresiz)
    public _3_Book() {
    }

    // Constructor (parametreli)
    public _3_Book(int id, String ad, String yazar, _2_BookTypes tur) {
        this.id = id;
        this.bookName = ad;
        this.bookWriter = yazar;
        this.bookTypes = tur;
        this.createdDate =LocalDate.now();
    }

    // Method
    public void informationWrite(){
        System.out.printf("ID: %d | %s - %s (%s) [%s]%n",
                id, bookName, bookWriter, bookTypes, createdDate.format(DateTimeFormatter.ofPattern("dd/MMMM/yyyy")));
    }

    // Getter And Setter

} // end Kitap
