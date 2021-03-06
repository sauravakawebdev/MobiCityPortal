package com.practice.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.Products;

@Repository("productRepository")
public interface ProductRepositry extends JpaRepository <Products, Integer> {
}