package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Vendedor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository {

    @Query(value ="SELECT * FROM vendedor WHERE vendedor.name = :user ", nativeQuery = true)
    Vendedor findUserAndPasswd(@Param("user") String user, @Param("passwd") String passwd);





}
