package com.oauthserver.oauthserver.repository;


import com.oauthserver.oauthserver.model.UserRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : admi on 6/24/2020
 */
public interface RoleRepository extends JpaRepository<UserRoleEntity,Long> {
}
