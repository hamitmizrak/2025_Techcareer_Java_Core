package com.hamitmizrak.tutorials.othercourse.services;


import com.hamitmizrak.tutorials.othercourse.dao.impl.ProductDao;
import com.hamitmizrak.tutorials.othercourse.dto.CustomerDto;
import com.hamitmizrak.tutorials.othercourse.dto.ProductDto;

import java.util.List;

// Asıl iş Yükünü yapan yer
public class ProductService {

    // Field
    private final ProductDao productDao = new ProductDao();

    // SAVE
    public void productServiceSave(ProductDto productDto, CustomerDto customerDto) {
        customerDto.addProduct(productDto);  // Composition Bağlantısı
        productDao.save(productDto);         // Disk'e yaz
    }

    // FIND ALL
    public List<ProductDto> productServiceFindAll() {
        return productDao.findAll();
    }

}
