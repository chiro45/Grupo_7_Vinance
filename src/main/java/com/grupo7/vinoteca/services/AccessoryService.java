package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccessoryService extends BaseService<Accessory, Long> {

    List<Accessory> findAccesoryByName(String name) throws Exception;
    Page<Accessory> findAccesoryByName(String name, Pageable pageable) throws Exception;

    List<Accessory> findAccesoryByPriceLower(float price) throws Exception;
    Page<Accessory> findAccesoryByPriceLowerPaged(float price, Pageable pageable) throws Exception;

    List<Accessory> findAccesoryByPriceUpper(float price) throws Exception;
    Page<Accessory> findAccesoryByPriceUpperPaged(float price, Pageable pageable) throws Exception;
    List<Accessory> findAccessoryByPriceEquals(float price) throws Exception;
    Page<Accessory> findAccessoryByPriceEqualsPaged(float price, Pageable pageable) throws Exception;
    //List<Accessory> findAccessoryByStock() throws Exception;
    //Page<Accessory> findAccessoryByStockPaged(Pageable pageable) throws Exception;
    List<Accessory> findAccessoryByActive(boolean active) throws Exception;
    Page<Accessory> findAccessoryByActivePaged(boolean active, Pageable pageable) throws Exception;

}