package com.developer.Ecommerce.Adaptor;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.developer.Ecommerce.DTO.ProductDTO;
import com.developer.Ecommerce.model.Product;
import com.developer.Ecommerce.service.ProductService;

@Component
public class ProductAdaptor {

    @Autowired
    ModelMapper ModelMapper;

    @Autowired
    ProductService productService;

    public Product dtoToEntity(ProductDTO productDTO) throws Exception {
        Product product = ModelMapper.map(productDTO, Product.class);
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        return product;
    }
    public ProductDTO entityToDTO(Product product) {
        ProductDTO productDTO = ModelMapper.map(product, ProductDTO.class);
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }
}
