package com.example.restchallenge.challenge1.service;

import com.example.restchallenge.challenge1.domain.Product;
import com.example.restchallenge.challenge1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> getProduct() {
        return (List<Product>) productRepository.findAll();
    }
}
