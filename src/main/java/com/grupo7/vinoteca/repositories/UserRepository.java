package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends BaseRepository<User, Long> {

    List<User> findByNameContainingAndPasswordContaining(String name, String password);
    @Query(value = "SELECT u FROM User u WHERE u.name LIKE %:name% AND u.password LIKE %:password%")
    List<User> search(@Param("name") String name, @Param("password") String password);

    @Query(value = "SELECT * FROM users WHERE users.name LIKE %:name% AND users.password LIKE %:password%",
            nativeQuery = true)
    List<User> searchNativo(@Param("name") String name, @Param("password") String password);

}
