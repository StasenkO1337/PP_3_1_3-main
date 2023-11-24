package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.kata.spring.boot_security.demo.models.User;


public interface UserRepository extends JpaRepository<User, Long> {
    @Query("Select u from User u left join fetch u.roles where u.name=:username")
    User findByUsername(String username);

    User findById(long id);

    @Modifying
    @Query("update User u set u.name = ?1, u.password = ?2 where u.id = ?3")
    void setUserInfoById(String username, String password, Long id);
}
