package com.hamitmizrak.tutorials.othercourse.dto;

// ===> 3 Customer Sınıfı
// Bir müşteri nesnesini temsil eder
// @_01_Loggable anostasyonu ile işaretliyecektir.


import com.hamitmizrak.SpecialColor;
import com.hamitmizrak.tutorials.othercourse.utilty.Loggable;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// LOMBOK
@Getter
@Setter
@NoArgsConstructor


@Loggable("Customer") // Log Kategorisiyle belirtildi
public class CustomerDto extends BaseDto {

    // Field
    private String name;
    private String email;

    // Composition
    // Customer(1) - Product(N)
    private List<ProductDto> compositionProductList= new ArrayList<>();

    // Parametreli Constructor
    public CustomerDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // toString
    @Override
    public String toString() {
        return "_03_CustomerDto { " +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                SpecialColor.BLUE+
                ", Products='" + compositionProductList + '\'' +
                SpecialColor.RESET+
                ", creatAt=" + creatAt +
                '}';
    }

    // Method
    @Override
    public String getLogInfo() {
        return name + " " + email + " ";
    }

    // Customer içinde ==>  Product Add
    public void addProduct(ProductDto productDto){
        this.compositionProductList.add(productDto);
    }

} // end
