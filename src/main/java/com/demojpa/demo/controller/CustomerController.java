package com.demojpa.demo.controller;

import com.demojpa.demo.dao.CustomerDao;
import com.demojpa.demo.entity.Customers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerDao customerDao;

    @PostMapping("/addCustomer")
    public String addCustomer(@RequestBody Customers customer){
        return customerDao.addCustomer(customer);
    }
}
