package com.projeto.webservices.repositories;

import com.projeto.webservices.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
