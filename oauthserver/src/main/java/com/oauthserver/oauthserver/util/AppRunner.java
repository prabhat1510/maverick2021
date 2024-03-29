package com.oauthserver.oauthserver.util;

import com.oauthserver.oauthserver.constraint.UserStatus;
import com.oauthserver.oauthserver.model.UserRoleEntity;
import com.oauthserver.oauthserver.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * @Author : admi on 6/26/2020
 */
@Component
public class AppRunner implements CommandLineRunner {

    @Autowired private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        //Initially All will be delete when server startup
//        roleRepository.deleteAll();
    roleRepository.save(new UserRoleEntity(null,"ROLE_ADMIN", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
    roleRepository.save(new UserRoleEntity(null,"ROLE_USER", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
//        roleRepository.save(new UserRoleEntity(null,"ROLE_PATIENT", UserStatus.ACTIVE.getStatus(), LocalDateTime.now()));
        System.out.println("Role insert successfully.");
    }
}
