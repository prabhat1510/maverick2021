package com.springsecurity.springsecurityexample.repository;

import com.springsecurity.springsecurityexample.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;



public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}