package com.craig.pe.ptbackend;

import com.craig.pe.ptbackend.security.entity.Role;
import com.craig.pe.ptbackend.security.entity.User;
import com.craig.pe.ptbackend.security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;

@SpringBootApplication
public class PtbackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(PtbackendApplication.class, args);

    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    CommandLineRunner run(UserService userService){
        return args -> {
            userService.saveRole(new Role(null,"ROLE_USER"));
            userService.saveRole(new Role(null,"ROLE_MANAGER"));
            userService.saveRole(new Role(null,"ROLE_ADMIN"));
            userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

            userService.saveUser(new User(null,"Jhon Travolta","jhon","12345",new ArrayList<>()));
            userService.saveUser(new User(null,"Will Smith","will","78965",new ArrayList<>()));
            userService.saveUser(new User(null,"Jim Carry","jim","14785",new ArrayList<>()));
            userService.saveUser(new User(null,"Arnold Shwarzenegger","arnold","12345",new ArrayList<>()));


            userService.addRoleToUser("jhon","ROLE_USER");
            userService.addRoleToUser("jhon","ROLE_MANAGER");
            userService.addRoleToUser("will","ROLE_MANAGER");
            userService.addRoleToUser("jim","ROLE_ADMIN");
            userService.addRoleToUser("arnold","ROLE_SUPER_ADMIN");
            userService.addRoleToUser("arnold","ROLE_ADMIN");
            userService.addRoleToUser("arnold","ROLE_USER");


        };
    }

}
