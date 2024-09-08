package com.study.jwtbacic.repository;

import com.study.jwtbacic.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, String> {
}
