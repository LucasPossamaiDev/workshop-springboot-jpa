package com.projeto.webservices.controller;

import com.projeto.webservices.entities.Products;
import com.projeto.webservices.service.ProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/v1/product")
public class ProductController {

    @Autowired
    private ProductsService productsService;

    @GetMapping
    public ResponseEntity<List<Products>> findAll() {
        List<Products> list = productsService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Products> findById (@PathVariable Long id) {
        Products obj = productsService.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
