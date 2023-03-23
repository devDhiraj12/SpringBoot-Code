package com.demojpa.demo.controller;

import com.demojpa.demo.dao.ProductDao;
import com.demojpa.demo.entity.Products;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductsController {

    @Autowired
    private ProductDao productDao;

    @PostMapping("/addProduct")
    public String saveProducts(@RequestBody Products product){
        return productDao.addProduct(product);
    }
}
