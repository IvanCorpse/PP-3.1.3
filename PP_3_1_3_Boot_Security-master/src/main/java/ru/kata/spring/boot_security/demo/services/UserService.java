package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.entities.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();

    void saveUser(User user);

    void updateUser(User user);

    User getUser(Long id);

    void removeUser(Long id);

    User findByUsername(String username);
}
