package com.craig.pe.ptbackend.security.service;

import com.craig.pe.ptbackend.security.repository.UserRepository;
import com.craig.pe.ptbackend.security.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
public class UserService {
    final
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<User> getByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }

    public boolean existByUserName(String userName) {
        return userRepository.existsByUserName(userName);
    }

    public boolean existByEmail(String email) {
        return userRepository.existByEmail(email);
    }

    public void save(User user) {
        userRepository.save(user);
    }
}
