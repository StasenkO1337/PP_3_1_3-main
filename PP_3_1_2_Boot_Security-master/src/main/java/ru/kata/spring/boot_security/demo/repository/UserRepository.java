package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import ru.kata.spring.boot_security.demo.models.User;


public interface UserRepository extends JpaRepository<User, Long> {
    @Query("Select user from User user left join fetch user.roles where user.name=:username")
    User findByUsername(String username);

    User findById(long id);

    @Modifying
    @Query("update User user set user.name = ?1, user.password = ?2 where user.id = ?3")
    void setUserInfoById(String username, String password, Long id);
}
