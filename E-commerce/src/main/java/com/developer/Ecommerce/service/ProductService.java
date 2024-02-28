package com.developer.Ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.developer.Ecommerce.DTO.ProductDTO;

@Service
public interface ProductService {
    @Autowired
    public List<ProductDTO> getAllProduct();
}
