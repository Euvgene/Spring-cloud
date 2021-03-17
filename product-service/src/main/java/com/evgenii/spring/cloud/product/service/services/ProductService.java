package com.evgenii.spring.cloud.product.service.services;

import com.evgenii.spring.cloud.product.service.entity.Product;
import com.evgenii.spring.cloud.product.service.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public void deleteProductById(Long id){
        productRepository.deleteById(id);
    }

    public Product saveOrUpdate(Product product) {
        return productRepository.save(product);
    }
}
