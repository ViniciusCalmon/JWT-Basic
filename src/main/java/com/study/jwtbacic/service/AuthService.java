package com.study.jwtbacic.service;

import com.study.jwtbacic.config.TokenProvider;
import com.study.jwtbacic.dto.NovaContaRequest;
import com.study.jwtbacic.dto.TokenResponse;
import com.study.jwtbacic.entity.User;
import com.study.jwtbacic.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.study.jwtbacic.dto.LoginRequest;

import java.util.Collections;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final IUserRepository userRepository;
    private final RoleService roleService;
    private final PasswordEncoder passwordEncoder;

    private final AuthenticationManager authenticationManager;
    private final TokenProvider tokenProvider;

    public void criarConta(NovaContaRequest request) {
        userRepository.save(User.builder()
                .id(UUID.randomUUID().toString())
                .username(request.getUsername())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(Collections.singletonList(roleService.getRoleByName(request.getRoleName())))
                .build());
    }

    public TokenResponse login(LoginRequest request) throws Exception {
        try {
            Authentication authentication = authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword())
            );
            return tokenProvider.generateToken(authentication);
        } catch (AuthenticationException e) {
            throw new Exception("Credenciais inválidas: " + e.getMessage());
        } catch (Exception e) {
            throw new Exception("Erro ao autenticar: " + e.getMessage());
        }
    }

}