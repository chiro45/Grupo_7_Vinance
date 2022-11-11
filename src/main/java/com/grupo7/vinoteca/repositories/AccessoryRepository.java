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

    @Query(value = "SELECT * FROM accessories WHERE accessories.name LIKE %:name% ", countQuery = "SELECT count(*) FROM accessories", nativeQuery = true)
    Page<Accessory> findAccesoryByNamePaged(String name, Pageable pageable);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price <= :price ", nativeQuery = true)
    List<Accessory> findAccesoryByPriceLower(float price);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price <= :price ", countQuery = "SELECT count(*) FROM accessories",nativeQuery = true)
    Page<Accessory> findAccesoryByPriceLowerPaged(float price, Pageable pageable);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price >= :price ", nativeQuery = true)
    List<Accessory> findAccesoryByPriceUpper(float price);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price >= :price ", countQuery = "SELECT count(*) FROM accessories",nativeQuery = true)
    Page<Accessory> findAccesoryByPriceUpperPaged(float price, Pageable pageable);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price == :price ", nativeQuery = true)
    List<Accessory> findAccessoryByPriceEquals(float price);

    @Query(value = "SELECT * FROM accessories WHERE accessories.price == :price ", countQuery = "SELECT count(*) FROM accessories",nativeQuery = true)
    Page<Accessory> findAccessoryByPriceEqualsPaged(float price, Pageable pageable);

    @Query(value = "SELECT * FROM accessories WHERE accessories.stock > 0 ", nativeQuery = true)
    List<Accessory> findAccessoryByStock();

    @Query(value = "SELECT * FROM accessories WHERE accessories.stock > 0 ", countQuery = "SELECT count(*) FROM accessories", nativeQuery = true)
    Page<Accessory> findAccessoryByStockPaged(Pageable pageable);

    @Query(value = "SELECT * FROM accessories WHERE accessories.active :active ", nativeQuery = true)
    List<Accessory> findAccessoryByActive(boolean active);

    @Query(value = "SELECT * FROM accessories WHERE accessories.active :active ", countQuery = "SELECT count(*) FROM accessories", nativeQuery = true)
    Page<Accessory> findAccessoryByActivePaged(boolean active, Pageable pageable);


}