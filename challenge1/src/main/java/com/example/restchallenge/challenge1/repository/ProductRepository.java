package com.example.restchallenge.challenge1.repository;

import com.example.restchallenge.challenge1.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<Product,Integer> {
}
