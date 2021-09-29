package com.oauthserver.oauthserver.mapper;

import com.oauthserver.oauthserver.constraint.UserStatus;
import com.oauthserver.oauthserver.dto.AddressDTO;
import com.oauthserver.oauthserver.dto.UserSignupDTO;
import com.oauthserver.oauthserver.model.PersonAddressEntity;
import com.oauthserver.oauthserver.model.PersonProfileEntity;
import com.oauthserver.oauthserver.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @Author : admi on 6/26/2020
 */
@Component
public class MapperUserService implements Serializable {

    @Autowired private PasswordEncoder passwordEncoder;

    public UserEntity mapUserFromDTO(UserSignupDTO userSignupDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName(userSignupDTO.getUserName());
        userEntity.setStatus(UserStatus.ACTIVE.getStatus());
        userEntity.setPassword(passwordEncoder.encode(userSignupDTO.getPassword()));
        userEntity.setCreateDate(LocalDateTime.now());
        return userEntity;
    }

    public PersonProfileEntity mapPersonFromDTO(UserSignupDTO userSignupDTO) {
        PersonProfileEntity profileEntity = new PersonProfileEntity();
        profileEntity.setFirstName(userSignupDTO.getFirstName());
        profileEntity.setMiddleName(userSignupDTO.getMiddleName());
        profileEntity.setLastName(userSignupDTO.getLastName());
        profileEntity.setDateOfBirth(userSignupDTO.getDateOfBirth());
        profileEntity.setGender(userSignupDTO.getGender());
        profileEntity.setEmail(userSignupDTO.getEmail());
        profileEntity.setCellPhone(userSignupDTO.getCellPhone());
        profileEntity.setHomePhone(userSignupDTO.getHomePhone());
        profileEntity.setWorkPhone(userSignupDTO.getWorkPhone());
        profileEntity.setOccupation(userSignupDTO.getOccupation());
        profileEntity.setEmployer(userSignupDTO.getEmployer());
        profileEntity.setCreateDate(LocalDateTime.now());
        return profileEntity;
    }

    public PersonAddressEntity mapAddressFromDTO(AddressDTO addressDTO) {
        PersonAddressEntity addressEntity = new PersonAddressEntity();
        addressEntity.setAddressLineOne(addressDTO.getAddressLineOne());
        addressEntity.setAddressLineTwo(addressDTO.getAddressLineTwo());
        addressEntity.setAddressType(addressDTO.getAddressType());
        addressEntity.setProvince(addressDTO.getProvince());
        addressEntity.setCity(addressDTO.getCity());
        addressEntity.setPostalCode(addressDTO.getPostalCode());
        return addressEntity;
    }
}
