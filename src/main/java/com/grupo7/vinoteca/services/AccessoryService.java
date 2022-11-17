package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Accessory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AccessoryService extends BaseService<Accessory, Long> {

    List<Accessory> findAccessoryByName(String name) throws Exception;
    Page<Accessory> findAccessoryByNamePaged(String name, Pageable pageable) throws Exception;

    List<Accessory> findAccessoryByPriceLower(double price) throws Exception;
    Page<Accessory> findAccessoryByPriceLowerPaged(double price, Pageable pageable) throws Exception;

    List<Accessory> findAccessoryByPriceUpper(double price) throws Exception;
    Page<Accessory> findAccessoryByPriceUpperPaged(double price, Pageable pageable) throws Exception;
    //List<Accessory> findAccessoryByPriceEquals(float price) throws Exception;
    //Page<Accessory> findAccessoryByPriceEqualsPaged(float price, Pageable pageable) throws Exception;
    //List<Accessory> findAccessoryByStock() throws Exception;
    //Page<Accessory> findAccessoryByStockPaged(Pageable pageable) throws Exception;
    //List<Accessory> findAccessoryByActive(boolean active) throws Exception;
    //Page<Accessory> findAccessoryByActivePaged(boolean active, Pageable pageable) throws Exception;

}