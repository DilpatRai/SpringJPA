package com.example.newjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional methods for custom queries
    List<Product> findByName(String name);
    List<Product> findByPriceLessThan(double price);
    List<Product> findByCategory(String category);

}
