package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.repositories.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class WineService implements  BaseService<Wine>{

    @Autowired
    private WineRepository repository;
    @Override
    @Transactional
    public List<Wine> findAll() throws Exception {
        try {
            List<Wine> entities = this.repository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception((e.getMessage()));
        }
    }

    @Override
    @Transactional
    public Wine findById(long id) throws Exception {
        try {
            Optional<Wine> opt = this.repository.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception((e.getMessage()));
        }
    }

    @Override
    @Transactional
    public Wine save(Wine entity) throws Exception {
        try {
            Wine wines = this.repository.save(entity);
            return wines;
        } catch (Exception e) {
            throw new Exception((e.getMessage()));
        }
    }

    @Override
    @Transactional
    public Wine update(Wine entity, long id) throws Exception {
        try {
            Optional<Wine> opt = this.repository.findById(id);
            Wine wines = opt.get();
            wines = this.repository.save(entity);
            return wines;
        } catch (Exception e) {
            throw new Exception((e.getMessage()));
        }
    }

    @Override
    @Transactional
    public boolean delete(long id) throws Exception {
        try {
            Optional<Wine> opt = this.repository.findById(id);
            if (!opt.isEmpty()) {
                Wine wines = opt.get();
                this.repository.save(wines);
            } else {
                throw new Exception();
            }
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Transactional
    public List<Wine> findByName(String q) throws Exception{
        try{
            List<Wine> entities = this.repository.findByName(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Wine> findByCategory(String q) throws Exception{
        try{
            List<Wine> entities = this.repository.findByCategory(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Wine> findByBrand(String q) throws Exception{
        try{
            List<Wine> entities = this.repository.findByBrand(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Wine> findByPrice(String q) throws Exception{
        try{
            List<Wine> entities = this.repository.findByPrice(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Wine> findByVarietal(String q) throws Exception{
        try{
            List<Wine> entities = this.repository.findByVarietal(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
