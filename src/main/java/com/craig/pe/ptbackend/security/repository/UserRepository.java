package com.craig.pe.ptbackend.security.repository;

import com.craig.pe.ptbackend.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
