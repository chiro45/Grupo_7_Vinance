package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WineRepository extends BaseRepository<Wine, Long>  {

    @Query(value = "SELECT * FROM wines WHERE wines.name LIKE %:name% ", nativeQuery = true)
    List<Wine> findWineForName(String name);

    @Query(value = "SELECT * FROM wines WHERE wines.name LIKE %:name% ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Wine> findWineForName(String name, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.varietal LIKE %:varietal% ", nativeQuery = true)
    List<Wine> findWineForVarietal(String varietal);

    @Query(value = "SELECT * FROM wines WHERE wines.varietal LIKE %:varietal% ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Wine> findWineForVarietal(String varietal, Pageable pageable);

    @Query(value = "SELECT * FROM wines WHERE wines.price < :price ", nativeQuery = true)
    List<Wine> findWineForPrice(float price);

    @Query(value = "SELECT * FROM wines WHERE wines.price < :price ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Wine> findWineForPrice(float price, Pageable pageable);

}