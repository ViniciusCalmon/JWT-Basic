package com.study.jwtbacic.repository;

import com.study.jwtbacic.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolesRepository extends JpaRepository<Roles, String> {
}
