package com.tuna.repositories;

import com.tuna.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;
@EnableJpaRepositories
@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
    List<Product> findByProductName(String productName);
    List<Product> findAllByOrderByProductNameAsc();
    List<com.tuna.Entity.Product> findAllByOrderByProductNameDesc();

    List<com.tuna.Entity.Product> findByProductNameContainingIgnoreCase(String keyword);
}