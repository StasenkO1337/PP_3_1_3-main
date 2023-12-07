package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kata.spring.boot_security.demo.models.User;


public interface UserRepository extends JpaRepository<User, Long> {

    @Query("Select user from User user left join fetch user.roles where user.name=:name")
    User findByName(String name);

}
