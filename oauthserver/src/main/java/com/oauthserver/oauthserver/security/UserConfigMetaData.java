package com.oauthserver.oauthserver.security;


import com.oauthserver.oauthserver.model.UserEntity;
import com.oauthserver.oauthserver.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.*;

/**
 * @Author : admi on 6/23/2020
 */
@Slf4j
@Component
public class UserConfigMetaData implements Serializable {

    @Autowired
    private UserService userService;


    public Map<String, Object> getUserRelatedInformation(String userName) {
        Map<String, Object> maps = new HashMap<>();
        UserEntity userEntity = userService.findByUserName(userName);
        maps.put("user_role", userEntity.getUserRoleEntity().getRoleName());
        maps.put("userName", userEntity.getUserName());
        maps.put("fullName", userEntity.getPersonProfileEntity().getFirstName().concat(" ").concat(userEntity.getPersonProfileEntity().getLastName()));
        maps.put("email", userEntity.getPersonProfileEntity().getEmail());
        return maps;
    }
}
