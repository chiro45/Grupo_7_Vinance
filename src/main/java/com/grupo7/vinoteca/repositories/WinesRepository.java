package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Wines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface WinesRepository extends JpaRepository<Wines, Long> {
    @Query(value = "SELECT * FROM wines WHERE wines.name LIKE %:q%", nativeQuery = true)
    List<Wines> findByName(@Param("q")String q);
    @Query(value = "SELECT * FROM wines WHERE wines.price LIKE %:q%", nativeQuery = true)
    List<Wines> findByPrice(@Param("q")String q);
    @Query(value = "SELECT * FROM wines WHERE wines.brand LIKE %:q%", nativeQuery = true)
    List<Wines> findByBrand(@Param("q")String q);
    @Query(value = "SELECT * FROM wines WHERE wines.category LIKE %:q%", nativeQuery = true)
    List<Wines> findByCategory(@Param("q")String q);
    @Query(value = "SELECT * FROM wines WHERE wines.varietal LIKE %:q%", nativeQuery = true)
    List<Wines> findByVarietal(@Param("q")String q);

}
