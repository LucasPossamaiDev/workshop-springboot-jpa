package com.projeto.webservices.service;

import com.projeto.webservices.entities.Category;
import com.projeto.webservices.entities.User;
import com.projeto.webservices.repositories.CategoryRepository;
import com.projeto.webservices.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById (Long id) {
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }
}
