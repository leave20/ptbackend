package com.craig.pe.ptbackend.security.repository;

import com.craig.pe.ptbackend.security.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName (String name);
}
