package com.springsecurity.springsecurityexample.repository;


import com.springsecurity.springsecurityexample.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

    UserEntity findByUsername(String userName);
}
