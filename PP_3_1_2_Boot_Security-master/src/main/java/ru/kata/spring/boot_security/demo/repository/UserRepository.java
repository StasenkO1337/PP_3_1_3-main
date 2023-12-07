package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kata.spring.boot_security.demo.models.User;


public interface UserRepository extends JpaRepository<User, Long> {

    //хз как сделать чтобы выдавал единичный результат при нескольких свопадениях
    @Query("Select u from User u left join fetch u.roles where u.name=:name")
    User findByName(String name);

}