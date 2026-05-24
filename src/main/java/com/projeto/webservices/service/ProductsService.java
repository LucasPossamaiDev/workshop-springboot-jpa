package com.projeto.webservices.service;

import com.projeto.webservices.entities.Products;
import com.projeto.webservices.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsService {

    @Autowired
    private ProductRepository productRepository;

    public List<Products> findAll(){
        return productRepository.findAll();
    }

    public Products findById (Long id) {
        Optional<Products> obj = productRepository.findById(id);
        return obj.get();
    }
}
