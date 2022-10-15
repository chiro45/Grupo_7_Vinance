package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.repositories.AccessoryRepository;
import com.grupo7.vinoteca.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AccessoryServiceImpl extends BaseServiceImp<Accessory, Long> {

    @Autowired
    private AccessoryRepository accessoryRepository;


    public AccessoryServiceImpl(BaseRepository<Accessory, Long> baseRepository){
        super(baseRepository);
    }


}
