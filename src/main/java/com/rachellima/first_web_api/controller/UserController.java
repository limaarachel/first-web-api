package com.rachellima.first_web_api.controller;

import com.rachellima.first_web_api.model.UserWeb;
import com.rachellima.first_web_api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<UserWeb>getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    public  UserWeb getOne(@PathVariable String username) {
        return repository.findByUserName(username);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer id){
         repository.deleteById(id);
    }

    @PostMapping()
    public void postUser(@RequestBody UserWeb user) {
         repository.save(user);
    }
}
