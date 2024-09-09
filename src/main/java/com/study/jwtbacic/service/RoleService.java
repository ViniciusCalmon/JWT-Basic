package com.study.jwtbacic.service;

import com.study.jwtbacic.entity.Roles;
import com.study.jwtbacic.repository.IRolesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final IRolesRepository rolesRepository;

    public Roles getRoleByName(String name){
        Roles role = rolesRepository.findByName(name).orElse(null);
        if(Objects.isNull(role)){
            return rolesRepository.save(Roles.builder()
                    .id(UUID.randomUUID().toString())
                    .name("ROLE_" + name)
                    .build());
        }
        return role;
    }
}
