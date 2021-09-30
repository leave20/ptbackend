package com.craig.pe.ptbackend.security.repository;

import com.craig.pe.ptbackend.security.entity.Role;
import com.craig.pe.ptbackend.security.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Optional<Role> findByRoleName(RoleName rolName);

}
