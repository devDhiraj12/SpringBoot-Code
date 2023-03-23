package com.demojpa.demo.dao;

import com.demojpa.demo.entity.Products;
import com.demojpa.demo.repository.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao {

    @Autowired
    private ProductsRepository productsRepository;

    public String addProduct(Products product){
        productsRepository.save(product);
        return "Product Added Successfully";
    }
}
