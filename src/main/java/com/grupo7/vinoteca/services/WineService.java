package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Wine;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public interface WineService extends BaseService<Wine, Long> {

    Wine findWineForName(String name) throws Exception;
    //Page<Wine> findWineForName(String name, Pageable pageable) throws Exception;

    List<Wine> findWineForVarietal(String varietal) throws Exception;

    Page<Wine> findWineForVarietal(String varietal, Pageable pageable) throws Exception;

    List<Wine> findWineForPrice(float price) throws Exception;

    Page<Wine> findWineForPrice(float price, Pageable pageable) throws Exception;

    public List<Wine> findAllByActivo() throws Exception;

    Wine findByIdAndActivo(long id) throws Exception;

    List<Wine> findByName(String q) throws Exception;


}