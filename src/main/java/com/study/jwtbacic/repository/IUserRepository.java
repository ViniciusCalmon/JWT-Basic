package com.study.jwtbacic.repository;

import com.study.jwtbacic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IUserRepository extends JpaRepository<User, String> {

    Optional<User> findByUsername(String username);
}
