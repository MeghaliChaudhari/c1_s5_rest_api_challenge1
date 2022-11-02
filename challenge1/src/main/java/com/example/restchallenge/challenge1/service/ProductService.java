package com.example.restchallenge.challenge1.service;

import com.example.restchallenge.challenge1.domain.Product;

import java.util.List;

public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> getProduct();
}
