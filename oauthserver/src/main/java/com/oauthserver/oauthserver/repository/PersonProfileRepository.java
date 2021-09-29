package com.oauthserver.oauthserver.repository;


import com.oauthserver.oauthserver.model.PersonProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author : admi on 6/24/2020
 */
public interface PersonProfileRepository extends JpaRepository<PersonProfileEntity,Long> {
}
