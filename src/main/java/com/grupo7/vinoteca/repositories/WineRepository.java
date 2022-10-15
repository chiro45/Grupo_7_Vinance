package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WineRepository extends JpaRepository<Wine, Long> {
    @Query(value = "SELECT * FROM wines WHERE wines.name LIKE %:q%", nativeQuery = true)
    List<Wine> findByName(@Param("q")String q);
    @Query(value = "SELECT * FROM wines WHERE wines.price LIKE %:q%", nativeQuery = true)
    List<Wine> findByPrice(@Param("q")String q);
    @Query(value = "SELECT * FROM wines WHERE wines.brand LIKE %:q%", nativeQuery = true)
    List<Wine> findByBrand(@Param("q")String q);
    @Query(value = "SELECT * FROM wines WHERE wines.category LIKE %:q%", nativeQuery = true)
    List<Wine> findByCategory(@Param("q")String q);
    @Query(value = "SELECT * FROM wines WHERE wines.varietal LIKE %:q%", nativeQuery = true)
    List<Wine> findByVarietal(@Param("q")String q);

}
