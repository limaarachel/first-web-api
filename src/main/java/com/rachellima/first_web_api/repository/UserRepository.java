package com.rachellima.first_web_api.repository;

import com.rachellima.first_web_api.model.UserWeb;
import org.springframework.stereotype.Repository;

import java.util.*;


@Repository
public class UserRepository {
    public void save(UserWeb user) {
        if (user.getId() == null)
            System.out.println("Save - Recebendo user na camada de repository");
        else
            System.out.println("Update - Recebendo user na camada repository");

        System.out.println(user);
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("Delete/id - Recebendo id %d para excluir um user",id));
        System.out.println(id);
    }

    public List<UserWeb> findAll() {
        System.out.println("LIST - Listando os users do sistema");
        List<UserWeb> users = new ArrayList<>();
        users.add(new UserWeb("rachelx", "567p"));
        users.add(new UserWeb("xmen", "1234x"));
        return users;
    }

    public UserWeb findById(Integer id) {
        System.out.println(String.format("List/id - Recebendo id %d para localizar um user", id));
        return new UserWeb("rachel", "password");
    }

    public UserWeb findByUserName(String name) {
        System.out.println(String.format("List/username - Recebendo id %s para localizar um user por name", name));
        return new UserWeb("rachel", "password");
    }
}
