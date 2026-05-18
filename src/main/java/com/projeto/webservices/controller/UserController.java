package com.projeto.webservices.controller;

import com.projeto.webservices.entities.User;
import com.projeto.webservices.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/v1/users")
public class UserController {

    @Autowired
    private UserService userservice;

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> list = userservice.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById (@PathVariable Long id) {
        User obj = userservice.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
