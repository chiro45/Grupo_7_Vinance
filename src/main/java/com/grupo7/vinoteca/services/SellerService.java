package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class SellerService implements BaseService<Seller>{

    @Autowired
    private SellerRepository repository;

    @Override
    @Transactional
    public List<Seller> findAll() throws Exception {
        try{
            List<Seller> entities = repository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Seller findById(long id) throws Exception {
        try{
            Optional<Seller> optional = repository.findById(id);
            return optional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Seller save(Seller entity) throws Exception {
        try{
            entity = repository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Seller update(Seller entity, long id) throws Exception {
        try{
            Optional<Seller> optional = repository.findById(id);
            Seller seller = optional.get();
            seller = repository.save(entity);
            return seller;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(long id) throws Exception {
        try{
            if(repository.existsById(id)) {
                repository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }







}
