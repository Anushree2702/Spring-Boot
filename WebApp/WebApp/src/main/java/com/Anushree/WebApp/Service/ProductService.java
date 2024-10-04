package com.Anushree.WebApp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Anushree.WebApp.Model.Product;
import com.Anushree.WebApp.repository.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    /*List<Product> products=new ArrayList<>(Arrays.asList(new Product(101,"samsung",5000),
    new Product(101, "iphone", 100),
    new Product(103, "micromax", 2000)));*/

    public List<Product> getProducts()
    {
        return repo.findAll();
    }

    public Product getProductById(int prodId)
    {
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod) {
        repo.save(prod);
    }

	public void updateproduct(Product prod) {
        repo.save(prod);
	}

    public void deleteproduct(int prodId) {
        repo.deleteById(prodId);
    }
    
}
