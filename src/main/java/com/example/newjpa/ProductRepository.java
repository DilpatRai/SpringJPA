package com.example.newjpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Additional methods for custom queries
    List<Product> findByName(String name);
    List<Product> findByPriceLessThan(double price);
    List<Product> findByCategory(String category);
@Query("SELECT p FROM Product p WHERE p.price < ?1")
    List<Product> findByPriceLessThanQuery(double price);
}
