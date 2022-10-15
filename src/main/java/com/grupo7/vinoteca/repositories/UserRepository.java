package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends BaseRepository<User, Long> {
}
