package com.example.coronaApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.coronaApp.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByTitleContaining(String title);
}
