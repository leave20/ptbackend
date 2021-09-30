package com.craig.pe.ptbackend.security.repository;

import com.craig.pe.ptbackend.security.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    Optional<User>findByUserName(String userName);
    boolean existsByUserName(String userName);
    boolean existByEmail(String email);

}
