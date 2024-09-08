package com.study.jwtbacic.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import org.springframework.security.core.GrantedAuthority;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "tb_roles")
public class Roles implements GrantedAuthority {

    @Id
    @Column(length = 36)
    private String id;

    @Column(name = "name")
    private String name;

    @Override
    public String getAuthority() {
        return "";
    }

    @Override
    public String toString() {
        return "{\"id\":\"" + id + "\", \"name\":\"" + name + "\"}";
    }
}
