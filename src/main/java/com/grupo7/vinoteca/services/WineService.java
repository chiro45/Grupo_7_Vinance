package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WineService extends BaseService<Wine, Long> {

    Wine findWineForName(String name) throws Exception;
    //Page<Wine> findWineForName(String name, Pageable pageable) throws Exception;

    List<Wine> findWineForVarietal(String varietal) throws Exception;
    Page<Wine> findWineForVarietal(String varietal, Pageable pageable) throws Exception;

    List<Wine> findWineForPrice(float price) throws Exception;
    Page<Wine> findWineForPrice(float price, Pageable pageable) throws Exception;

}