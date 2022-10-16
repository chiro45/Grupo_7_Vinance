package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WineRepository extends BaseRepository<Wine, Long>  {


    @Query(value = "SELECT * FROM wines WHERE wines.name LIKE %:name% ", nativeQuery = true)
    List<Wine> findWineForName(String name);

    @Query(value = "SELECT * FROM wines WHERE wines.varietal LIKE %:varietal% ", nativeQuery = true)
    List<Wine> findWineForVarietal(String varietal);


    @Query(value = "SELECT * FROM wines WHERE wines.price < %:price% ", nativeQuery = true)
    List<Wine> findWineForPrice(String price);
}
