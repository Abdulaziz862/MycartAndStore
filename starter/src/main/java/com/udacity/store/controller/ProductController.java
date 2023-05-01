package com.udacity.store.controller;

import com.udacity.store.model.Product;
import com.udacity.store.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/")
@CrossOrigin(origins = "http://localhost:4200")


public class ProductController {
// TODO: Use the mapping products to add an API endpoint to fetch the products from the ProductRepository

    @Autowired
    ProductRepository productRepository;
//@PostMapping("/Create")
//public void createProduct(Product product) {
//    productRepository.save(product);
//}
    @GetMapping("/all")
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{productId}")//add product name in the URL
    public Product getProductById(@PathVariable("productId") Long productId){
    return  productRepository.findById(productId).get();
    }
}
