package com.developer.Ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.developer.Ecommerce.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
