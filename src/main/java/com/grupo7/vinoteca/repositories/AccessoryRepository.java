package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccessoryRepository  extends BaseRepository<Accessory, Long>  {

    @Query(value = "SELECT * FROM accessories WHERE accessories.name LIKE %:name% ", nativeQuery = true)
    List<Accessory> findAccesoryByName(String name);

    @Query(value = "SELECT * FROM accessories WHERE accessories.name LIKE %:name% ", countQuery = "SELECT count(*) FROM accessories", nativeQuery = true)
    Page<Accessory> findAccesoryByName(String name, Pageable pageable);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price <= :price ", nativeQuery = true)
    List<Accessory> findAccesoryByPrice(float price);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price <= :price ", countQuery = "SELECT count(*) FROM accessories",nativeQuery = true)
    Page<Accessory> findAccesoryByPrice(float price, Pageable pageable);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price >= :price ", nativeQuery = true)
    List<Accessory> findAccesoryByPriceMore(float price);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price >= :price ", countQuery = "SELECT count(*) FROM accessories",nativeQuery = true)
    Page<Accessory> findAccesoryByPriceMore(float price, Pageable pageable);

    @Query(value = "SELECT * FROM accessories  WHERE accessories.activo = true", nativeQuery = true)
    List<Accessory> findAllByActivo();

    @Query(value = "SELECT * FROM accessories  WHERE accessories.id = :id AND accessories.activo = true", nativeQuery = true)
    Optional<Accessory> findByIdAndActivo(@Param("id") long id);

    @Query(value = "SELECT * FROM accessories WHERE accessories.name LIKE %:d% AND accessories.activo =true", nativeQuery = true)
    List<Accessory> findByName(@Param("d") String d);
}