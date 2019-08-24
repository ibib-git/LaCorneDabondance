package com.spring.henallux.laCorneDabondance.service;

import com.spring.henallux.laCorneDabondance.dataAccess.dao.UserDAO;
import com.spring.henallux.laCorneDabondance.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserDAO userDAO;

    private PasswordEncoder passwordEncoder;

    public void insertUser (UserModel user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDAO.insertUser(user);
    }






}
