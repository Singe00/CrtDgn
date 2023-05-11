package com.example.CrtDgn.Security.Jwt;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JwtRepository extends JpaRepository<JwtDomain,Long> {
    JwtDomain findByToken(String token);
}
