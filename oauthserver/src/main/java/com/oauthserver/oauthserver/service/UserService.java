package com.oauthserver.oauthserver.service;

import com.oauthserver.oauthserver.dto.UserSignupDTO;
import com.oauthserver.oauthserver.model.UserEntity;


/**
 * @Author : admi on 6/23/2020
 */
public interface UserService {

    String signup(UserSignupDTO userSignupDTO);

    UserEntity findByUserName(String userName);
}
