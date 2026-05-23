package com.projeto.webservices.repositories;

import com.projeto.webservices.entities.Category;
import com.projeto.webservices.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
