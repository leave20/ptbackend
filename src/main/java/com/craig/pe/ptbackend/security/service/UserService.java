package com.craig.pe.ptbackend.security.service;

import com.craig.pe.ptbackend.security.entity.Role;
import com.craig.pe.ptbackend.security.entity.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);

    void addRoleToUser(String username,String  rolename);
    User getUser(String username);
    List<User> getUsers();

}
