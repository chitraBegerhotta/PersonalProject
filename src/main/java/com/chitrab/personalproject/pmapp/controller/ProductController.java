package com.chitrab.personalproject.pmapp.controller;

import com.chitrab.personalproject.pmapp.model.Product;
import com.chitrab.personalproject.pmapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @CrossOrigin
    @RequestMapping(method = RequestMethod.GET, value = "/products")
    public List<Product> getAllProducts(){

        return productService.getAllProducts();
    }


}
