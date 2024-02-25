package com.developer.Ecommerce.service.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.developer.Ecommerce.DTO.ProductDTO;
import com.developer.Ecommerce.model.Product;
import com.developer.Ecommerce.repo.ProductRepo;
import com.developer.Ecommerce.service.ProductService;

public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepo productRepo;

    @Override
    public List<ProductDTO> getProduct() {
        return productRepo.findAll();
    }

}
