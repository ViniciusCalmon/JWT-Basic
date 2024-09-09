package com.study.jwtbacic.repository;

import com.study.jwtbacic.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, String> {
    Optional<Roles> findByName(String name);
}
