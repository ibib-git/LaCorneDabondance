package com.spring.henallux.laCorneDabondance.dataAccess.util;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import com.spring.henallux.laCorneDabondance.model.UserModel;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity userModelToEntity (UserModel userModel)
    {
        UserEntity userEntity = new UserEntity();

        userEntity.setUsername(userModel.getUser());
        userEntity.setFirstname(userModel.getFirstName());
        userEntity.setLastname(userModel.getLastName());
        userEntity.setAdressDelivery(userModel.getAdressDelivery());
        userEntity.setAdressPrivate(userModel.getAdressPrivate());
        userEntity.setMail(userModel.getMail());
        userEntity.setPhone(userModel.getPhone());
        userEntity.setPassword(userModel.getPassword());

        return userEntity;
    }

    public UserModel userEntityToModel (UserEntity userEntity)
    {
        UserModel userModel = new UserModel();

        userModel.setUser(userEntity.getUsername());
        userModel.setFirstName(userEntity.getFirstname());
        userModel.setLastName(userEntity.getLastname());
        userModel.setAdressDelivery(userEntity.getAdressDelivery());
        userModel.setAdressPrivate(userEntity.getAdressPrivate());
        userModel.setMail(userEntity.getMail());
        userModel.setPhone(userEntity.getPhone());

        return userModel;

    }
}
