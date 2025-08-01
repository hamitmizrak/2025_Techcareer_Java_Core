package com.hamitmizrak.tutorials.othercourse.controller.impl;

import com.hamitmizrak.SpecialColor;
import com.hamitmizrak.tutorials.othercourse.dto.CustomerDto;
import com.hamitmizrak.tutorials.othercourse.dto.ProductDto;
import com.hamitmizrak.tutorials.othercourse.services.ProductService;


import java.util.List;

public class ProductControllerImpl {

    // Field
    private final ProductService productService = new ProductService();

    // SAVE
    public void productControllerSave(ProductDto productDto, CustomerDto customerDto) {
        productService.productServiceSave(productDto,customerDto);
        System.out.println(SpecialColor.BLUE+" Ürün Başarıyla Eklendi "+SpecialColor.RESET);
    }

    // FIND ALL
    public void productControllerFindAll() {
        List<ProductDto> productDtoList = productService.productServiceFindAll();
        System.out.println(SpecialColor.YELLOW+ "Tüm Müşteriler"+SpecialColor.RESET+"\n");
        for ( ProductDto productDto : productDtoList){
            System.out.println(productDto);
        }
    }

} // end CustomerController
