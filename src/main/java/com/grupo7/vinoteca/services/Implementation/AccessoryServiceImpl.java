package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.repositories.AccessoryRepository;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.services.AccessoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessoryServiceImpl extends BaseServiceImp<Accessory, Long> implements AccessoryService {

    @Autowired
    private AccessoryRepository accessoryRepository;

    public AccessoryServiceImpl(BaseRepository<Accessory, Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Accessory> findAccesoryByName(String name) throws Exception {
        try {
            List<Accessory> accessories = accessoryRepository.findAccesoryByName(name);
            if(accessories.size() > 0){
                return accessories;
            }else{
                return null;
            }
        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Accessory> findAccesoryByName(String name, Pageable pageable) throws Exception {
        try {
            Page<Accessory> accessories = accessoryRepository.findAccesoryByName(name, pageable);
            return accessories;
        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Accessory> findAccesoryByPrice(float price) throws Exception {
        try {
            List<Accessory> accessories = accessoryRepository.findAccesoryByPrice(price);
            return accessories;
        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Accessory> findAccesoryByPrice(float price, Pageable pageable) throws Exception {
        try {
            Page<Accessory> accessories = accessoryRepository.findAccesoryByPrice(price, pageable);
            return accessories;
        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Accessory> findAccesoryByPriceMore(float price) throws Exception {
        try {
            List<Accessory> accessories = accessoryRepository.findAccesoryByPriceMore(price);
            return accessories;
        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Accessory> findAccesoryByPriceMore(float price, Pageable pageable) throws Exception {
        try {
            Page<Accessory> accessories = accessoryRepository.findAccesoryByPriceMore(price, pageable);
            return accessories;
        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

}