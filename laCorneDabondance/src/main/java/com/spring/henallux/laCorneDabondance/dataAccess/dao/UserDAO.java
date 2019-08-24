package com.spring.henallux.laCorneDabondance.dataAccess.dao;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import com.spring.henallux.laCorneDabondance.dataAccess.repository.UserRepository;
import com.spring.henallux.laCorneDabondance.dataAccess.util.UserConverter;
import com.spring.henallux.laCorneDabondance.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserDAO {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConverter userConverter;

    public UserModel findUserByLogin (String login)
    {
        UserEntity userEntity = userRepository.findByLogin(login);

        return userConverter.userEntityToModel(userEntity);
    }

    public void insertUser (UserModel user)
    {
        UserEntity userEntity = userConverter.userModelToEntity(user);

        userRepository.save(userEntity);


    }
}
