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

    List<Accessory> findAccesoryByPrice(float price) throws Exception;
    Page<Accessory> findAccesoryByPrice(float price, Pageable pageable) throws Exception;

    List<Accessory> findAccesoryByPriceMore(float price) throws Exception;
    Page<Accessory> findAccesoryByPriceMore(float price, Pageable pageable) throws Exception;
    public List<Accessory> findAllByActivo() throws Exception;
    Accessory findByIdAndActivo(long id) throws Exception;
    List<Accessory> findByName(String d) throws Exception;

}