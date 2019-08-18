package com.spring.henallux.laCorneDabondance.dataAccess.util;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import com.spring.henallux.laCorneDabondance.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity userModelToEntity (UserModel userModel)
    {
        UserEntity userEntity = new UserEntity();

        userEntity.setLogin(userModel.getUser());
        userEntity.setFirstname(userModel.getFirstName());
        userEntity.setLastname(userModel.getLastName());
        userEntity.setAdressDelivery(userModel.getAdressDelivery());
        userEntity.setAdressPrivate(userModel.getAdressPrivate());
        userEntity.setMail(userModel.getMail());
        userEntity.setPhone(userModel.getPhone());
        userEntity.setPassword(userModel.getPassword());
        userEntity.setNon_Locked(userModel.getNon_locked());
        userEntity.setEnabled(userModel.getEnabled());
        userEntity.setAuthorities(userModel.getAuthorities());

        return userEntity;
    }

    public UserModel userEntityToModel (UserEntity userEntity)
    {
        UserModel userModel = new UserModel();

        userModel.setUser(userEntity.getLogin());
        userModel.setFirstName(userEntity.getFirstname());
        userModel.setLastName(userEntity.getLastname());
        userModel.setAdressDelivery(userEntity.getAdressDelivery());
        userModel.setAdressPrivate(userEntity.getAdressPrivate());
        userModel.setMail(userEntity.getMail());
        userModel.setPhone(userEntity.getPhone());
        userModel.setAuthorities(userEntity.getAuthorities());
        userModel.setCredentials_non_expired(userEntity.getCredentials_non_expired());
        userModel.setEnabled(userEntity.getEnabled());
        userModel.setPassword(userEntity.getPassword());

        return userModel;

    }
}
