package com.evgenii.spring.cloud.product.service.controllers;

import com.evgenii.spring.cloud.product.service.entity.Product;
import com.evgenii.spring.cloud.product.service.services.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProductById(id);
    }

    @PostMapping
    public Product saveNewProduct(@RequestBody Product product) {
        return productService.saveOrUpdate(product);
    }
}
