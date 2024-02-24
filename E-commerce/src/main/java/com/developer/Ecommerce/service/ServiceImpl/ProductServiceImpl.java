package com.developer.Ecommerce.service.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.developer.Ecommerce.repo.ProductRepo;
import com.developer.Ecommerce.service.ProductService;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;
    @Override
    public String getProduct() {
     productRepo.findAll();
    }
    
}
