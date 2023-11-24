package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    User findById(long id);
    void updateUser(User user);
    void deleteUser(long id);
    void addUser(User user);
    List<User> getAllUsers();

}
