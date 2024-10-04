package com.Anushree.WebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Anushree.WebApp.Model.Product;
import com.Anushree.WebApp.Service.ProductService;


@RestController
public class ProducController {                           //controller is for accepting the request and responding to the clients


    @Autowired
    ProductService service;

    @GetMapping("/products")
    public List<Product> getProduct()
    {
        return service.getProducts();
    }

    //to get product by id

    @GetMapping("/products/{prodId}")
    public Product geProductById(@PathVariable int prodId)
    {
        return service.getProductById(prodId);

    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        System.out.println(prod);
        service.addProduct(prod);
    }
   
    @PutMapping("/products")
    public void updateproduct(@RequestBody Product prod)
    {
        System.out.println("updated");
        service.updateproduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteproduct(@PathVariable int prodId)
    {
        service.deleteproduct(prodId);


    }
}
