package com.grupo7.vinoteca.repositories;

import com.grupo7.vinoteca.entities.Accessory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccessoryRepository  extends BaseRepository<Accessory, Long>  {

    @Query(value = "SELECT * FROM accessories WHERE accessories.name LIKE %:name% ", nativeQuery = true)
    List<Accessory> findAccesoryByName(String name);

    @Query(value = "SELECT * FROM accessories WHERE accessories.name LIKE %:name% ", countQuery = "SELECT count(*) FROM wines", nativeQuery = true)
    Page<Accessory> findAccesoryByNamePaged(String name, Pageable pageable);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price <= :price ", nativeQuery = true)
    List<Accessory> findAccesoryByPrice(float price);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price <= :price ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Accessory> findAccesoryByPricePaged(float price, Pageable pageable);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price >= :price ", nativeQuery = true)
    List<Accessory> findAccesoryByPriceMore(float price);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price >= :price ", countQuery = "SELECT count(*) FROM wines",nativeQuery = true)
    Page<Accessory> findAccesoryByPriceMorePaged(float price, Pageable pageable);
}