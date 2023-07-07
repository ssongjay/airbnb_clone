package com.example.airbnbclone.repository;

import com.example.airbnbclone.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User save(User user);
    Optional<User> findById(int id);
    Optional<User> findByName(String name);
    List<User> findByEmail(String email);
    List<User> findAll();
}
