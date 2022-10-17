package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Seller;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepository  extends BaseRepository<Seller, Long> {



    @Query(value = "SELECT * FROM sellers WHERE sellers.name = :name AND sellers.password = :passwd", nativeQuery = true)
    List<Seller> userLogin(@Param("name") String name, @Param("passwd") String passwd);


}
