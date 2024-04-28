package com.developer.Ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.Ecommerce.DTO.ProductDTO;
import com.developer.Ecommerce.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<ProductDTO> getProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public ProductDTO getProductById(long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> addProduct(ProductDTO productDTO) {
        ProductDTO product = productService.addProduct(productDTO);
        return ResponseEntity.ok(product);
    }
}
