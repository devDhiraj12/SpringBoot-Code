package com.demojpa.demo.dao;

import com.demojpa.demo.entity.Customers;
import com.demojpa.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDao {

    @Autowired
    private CustomerRepository customerRepository;

    public String addCustomer(Customers customer){
        customerRepository.save(customer);
        return "Customer Added Successfully!!!";
    }
}
