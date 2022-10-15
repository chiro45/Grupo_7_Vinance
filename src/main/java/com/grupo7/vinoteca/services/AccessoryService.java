package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.repositories.AccessoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AccessoryService implements BaseService<Accessory>{

    @Autowired
    private AccessoryRepository accessoryRepository;
    @Override
    @Transactional
    public List<Accessory> findAll() throws Exception {
        try{
            List<Accessory> entities = accessoryRepository.findAll();
            return entities;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Accessory findById(long id) throws Exception {
        try{
            Optional<Accessory> optional = accessoryRepository.findById(id);
            return optional.get();
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Accessory save(Accessory entity) throws Exception {
        try{
            entity = accessoryRepository.save(entity);
            return entity;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public Accessory update(Accessory entity, long id) throws Exception {
        try{
            Optional<Accessory> optional = accessoryRepository.findById(id);
            Accessory accessory = optional.get();
            accessory = accessoryRepository.save(entity);
            return accessory;
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(long id) throws Exception {
        try{
            if(accessoryRepository.existsById(id)) {
                accessoryRepository.deleteById(id);
                return true;
            }else{
                throw new Exception();
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
