package com.hamitmizrak.tutorials.othercourse.services;


import com.hamitmizrak.tutorials.othercourse.dao.impl.CustomerDao;
import com.hamitmizrak.tutorials.othercourse.dto.CustomerDto;

import java.util.List;

// Asıl iş Yükünü yapan yer
public class CustomerService {

    // Field
    private final CustomerDao customerDao = new CustomerDao();

    // SAVE
    public void customerServiceSave(CustomerDto customerDto) {
        customerDao.save(customerDto);
    }

    // FIND ALL
    public List<CustomerDto> customerServiceFindAll() {
        return customerDao.findAll();
    }

}
