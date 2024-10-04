package com.Anushree.WebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Anushree.WebApp.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product , Integer> {
    

    
}
