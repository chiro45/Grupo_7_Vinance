package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Seller;

import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.SellerRepository;
import com.grupo7.vinoteca.services.Implementation.BaseServiceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service

public class SellerServiceImpl extends BaseServiceImp<Seller, Long> {
    @Autowired
    private SellerRepository sellerRepository;


    public SellerServiceImpl(BaseRepository<Seller, Long> baseRepository){
        super(baseRepository);
    }


}
