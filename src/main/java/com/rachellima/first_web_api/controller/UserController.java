package com.rachellima.first_web_api.controller;

import com.rachellima.first_web_api.model.UserWeb;
import com.rachellima.first_web_api.repository.UserRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/users")
@Tag(name = "Usuários", description = "API de gerenciamento de usuários")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping()
    public List<UserWeb>getUsers() {
        return repository.findAll();
    }

    @GetMapping("/{username}")
    @Operation(summary = "Buscar usuário por nome", description = "Retorna um usuário específico pelo nome")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Usuário encontrado"),
            @ApiResponse(responseCode = "404", description = "Usuário não encontrado")
    })
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
