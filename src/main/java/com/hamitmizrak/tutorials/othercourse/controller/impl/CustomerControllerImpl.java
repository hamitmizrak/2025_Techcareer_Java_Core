package com.hamitmizrak.tutorials.othercourse.controller.impl;

import com.hamitmizrak.tutorials.othercourse.dto.CustomerDto;
import com.hamitmizrak.tutorials.othercourse.services.CustomerService;


import java.util.List;

public class CustomerControllerImpl {

    // Field
    private final CustomerService customerService = new CustomerService();

    // SAVE
    public void customerControllerSave(CustomerDto customerDto) {
        customerService.customerServiceSave(customerDto);
        System.out.println("Müşteri Başarıyla Eklendi");
    }

    // FIND ALL
    public void customerControllerFindAll() {
        List<CustomerDto> customerDtoList = customerService.customerServiceFindAll();
        System.out.println("Tüm Müşteriler");
        for ( CustomerDto customerDto : customerDtoList){
            System.out.println(customerDto);
        }
    }

} // end CustomerController
