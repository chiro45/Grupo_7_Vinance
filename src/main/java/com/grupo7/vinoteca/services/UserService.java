package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.User;

public interface UserService extends BaseService<User, Long> {

    User loginUser(String name, String password) throws Exception;

}