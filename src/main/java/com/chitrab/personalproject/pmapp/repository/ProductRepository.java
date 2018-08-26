package com.chitrab.personalproject.pmapp.repository;

import com.chitrab.personalproject.pmapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
