package com.spring.henallux.laCorneDabondance.service;

import com.spring.henallux.laCorneDabondance.dataAccess.dao.UserDAO;
import com.spring.henallux.laCorneDabondance.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.Pbkdf2PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private Pbkdf2PasswordEncoder passwordEncoder;

    public UserModel findUserByLogin (String login) {return userDAO.findUserByLogin(login);}

    public void insertUser (UserModel user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userDAO.insertUser(user);
    }








}
