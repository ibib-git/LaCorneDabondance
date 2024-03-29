package com.spring.henallux.laCorneDabondance.service;
import com.spring.henallux.laCorneDabondance.dataAccess.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImplementation implements UserDetailsService{

    private UserRepository userRepository;

    @Autowired
    public UserDetailsServiceImplementation (UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserDetails user = userRepository.findByUsername(username);
        if(user!=null){
            return user;
        }
        throw new UsernameNotFoundException("User not found");
    }
}