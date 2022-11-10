package com.grupo7.vinoteca.security.service;

import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.security.entity.PrincipalUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsImpl implements UserDetailsService {

    @Autowired
    UserServiceSec userServiceImpl;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userServiceImpl.getByUsername(username).get();
        return PrincipalUser.build(user);
    }
}
