package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.entities.User;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {

    @Query(value = "SELECT * FROM users WHERE users.name = :name AND users.password = :password", nativeQuery = true)
    List<User> loginUser(@Param("name") String name, @Param("password") String password);

    @Query(value = "SELECT * FROM users WHERE users.name LIKE %:name% ", nativeQuery = true)
    List<User> findUserByName(String name);

    @Query(value = "SELECT * FROM users WHERE users.name LIKE %:name% ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<User> findUserByName(String name, Pageable pageable);

}