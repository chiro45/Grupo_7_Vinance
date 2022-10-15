package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {

    @Query(value ="SELECT * FROM vendedor WHERE vendedor.name = :user ", nativeQuery = true)
    Seller findUserAndPasswd(@Param("user") String user, @Param("passwd") String passwd);





}
