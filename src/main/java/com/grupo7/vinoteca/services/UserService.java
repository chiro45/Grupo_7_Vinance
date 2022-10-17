package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.User;

import java.util.List;

public interface UserService extends BaseService<User, Long> {

    User loginUser(String name, String password) throws Exception;
}
