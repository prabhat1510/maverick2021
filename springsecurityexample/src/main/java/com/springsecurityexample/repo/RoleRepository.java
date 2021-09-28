package com.springsecurityexample.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springsecurityexample.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	Role findByName(String name);
}
