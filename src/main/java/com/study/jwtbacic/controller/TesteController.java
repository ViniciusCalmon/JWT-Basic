package com.study.jwtbacic.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/test")
public class TesteController {

    @GetMapping("/liberado")
    public ResponseEntity<String> endpointLiberado(){
        return new ResponseEntity<>("Liberado", HttpStatus.OK);
    }

    @GetMapping("/requer_autenticacao")
    public ResponseEntity<String> requerAutenticacao(){
        return new ResponseEntity<>("Autenticado", HttpStatus.OK);
    }

    @GetMapping("/requer_autenticacao_admin")
    public ResponseEntity<String> requerAutenticacaoAdmin(){
        return new ResponseEntity<>("Autenticado admin", HttpStatus.OK);
    }

    @GetMapping("/roles")
    public ResponseEntity<?> getUserRoles(Authentication authentication) {
        return ResponseEntity.ok(authentication.getAuthorities());
    }

}
