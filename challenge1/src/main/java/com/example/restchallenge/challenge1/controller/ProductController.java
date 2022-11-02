package com.example.restchallenge.challenge1.controller;

import com.example.restchallenge.challenge1.domain.Product;
import com.example.restchallenge.challenge1.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product/v1/")
public class ProductController {

    private ProductServiceImpl productServiceImpl;

    @Autowired
    public ProductController(ProductServiceImpl productServiceImpl){
        this.productServiceImpl = productServiceImpl;
    }

    @PostMapping(value = "/product")
    public ResponseEntity<?> save(@RequestBody Product product){
        Product product1 = productServiceImpl.addProduct(product);
        return  new ResponseEntity<>(product1, HttpStatus.CREATED);
    }

    @GetMapping(value = "/product")
    public ResponseEntity<?> get(){
        List<Product> list = productServiceImpl.getProduct();
        return new ResponseEntity<>(list,HttpStatus.OK);
    }

}
