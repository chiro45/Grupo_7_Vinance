package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserService extends BaseService<User, Long> {

    User loginUser(String name, String password) throws Exception;

    List<User> findUserByName(String name) throws Exception;

    Page<User> findUserByName(String name, Pageable pageable) throws Exception ;
}