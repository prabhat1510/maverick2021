package com.oauthserver.oauthserver.service;

import com.oauthserver.oauthserver.model.UserRoleEntity;


import java.util.List;


/**
 * @Author : admi on 6/23/2020
 */
public interface RoleService {

    List<UserRoleEntity> getAllRoles();

}
