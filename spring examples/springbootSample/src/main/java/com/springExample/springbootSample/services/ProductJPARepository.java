package com.springExample.springbootSample.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springExample.springbootSample.entities.Product;

public interface ProductJPARepository extends JpaRepository<Product, Integer> {

}
