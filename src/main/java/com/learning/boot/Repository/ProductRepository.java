package com.learning.boot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.boot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
