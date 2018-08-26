package com.chitrab.personalproject.pmapp.service;

import com.chitrab.personalproject.pmapp.model.Product;
import com.chitrab.personalproject.pmapp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

//    private List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(1, "Shoes", "gdn 0011", "March 19, 2016", 19.95, "it is a leaf rake", 3.3, "absc.com"),
//            new Product(2, "Accessories", "gdn 0023", "March 18, 2016", 32.99, "it is a garden cart", 4.1, "absc.com"),
//            new Product(3, "Clothing", "tbx 0048", "May 21, 2016", 8.90, "iron hammer", 5.0, "absc.com"),
//            new Product(4, "Watches", "tbx 0022", "May 15, 2016", 11.55, "it is a saw", 4.3, "absc.com"),
//            new Product(5, "Cosmetics", "gmg 0042", "October 15, 2015", 35.95, "it is a video controller", 5.0, "absc.com")
//    ));

    public List<Product> getAllProducts(){

         List<Product> products = productRepository.findAll();
        return products;
    }


}
