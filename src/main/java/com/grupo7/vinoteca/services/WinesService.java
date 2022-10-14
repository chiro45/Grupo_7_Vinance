package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Wines;
import com.grupo7.vinoteca.repositories.WinesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class WinesService implements  BaseService<Wines>{

    @Autowired
    private WinesRepository repository;
    @Override
    @Transactional
    public List<Wines> findAll() throws Exception {
        try {
            List<Wines> entities = this.repository.findAll();
            return entities;
        } catch (Exception e) {
            throw new Exception((e.getMessage()));
        }
    }

    @Override
    @Transactional
    public Wines findById(long id) throws Exception {
        try {
            Optional<Wines> opt = this.repository.findById(id);
            return opt.get();
        } catch (Exception e) {
            throw new Exception((e.getMessage()));
        }
    }

    @Override
    @Transactional
    public Wines saveOne(Wines entity) throws Exception {
        try {
            Wines wines = this.repository.save(entity);
            return wines;
        } catch (Exception e) {
            throw new Exception((e.getMessage()));
        }
    }

    @Override
    @Transactional
    public Wines updateOne(Wines entity, long id) throws Exception {
        try {
            Optional<Wines> opt = this.repository.findById(id);
            Wines wines = opt.get();
            wines = this.repository.save(entity);
            return wines;
        } catch (Exception e) {
            throw new Exception((e.getMessage()));
        }
    }

    @Override
    public boolean deleteById(long id) throws Exception {
        try {
            Optional<Wines> opt = this.repository.findById(id);
            if (!opt.isEmpty()) {
                Wines wines = opt.get();
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
    public List<Wines> findByName(String q) throws Exception{
        try{
            List<Wines> entities = this.repository.findByName(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Wines> findByCategory(String q) throws Exception{
        try{
            List<Wines> entities = this.repository.findByCategory(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Wines> findByBrand(String q) throws Exception{
        try{
            List<Wines> entities = this.repository.findByBrand(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Wines> findByPrice(String q) throws Exception{
        try{
            List<Wines> entities = this.repository.findByPrice(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
    @Transactional
    public List<Wines> findByVarietal(String q) throws Exception{
        try{
            List<Wines> entities = this.repository.findByVarietal(q);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
