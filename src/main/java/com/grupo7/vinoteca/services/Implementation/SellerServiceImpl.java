package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Seller;

import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.SellerRepository;
import com.grupo7.vinoteca.services.Implementation.BaseServiceImp;

import com.grupo7.vinoteca.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service

public class SellerServiceImpl extends BaseServiceImp<Seller, Long> implements SellerService {
    @Autowired
    private SellerRepository sellerRepository;


    public SellerServiceImpl(BaseRepository<Seller, Long> baseRepository){
        super(baseRepository);
    }






    //evalua si el usuario Existe
    @Override
    public Seller userLogin(String name, String passwd) throws Exception {
        try {
            List<Seller> arrSellers = sellerRepository.userLogin(name, passwd);

            if(arrSellers.size() > 0){

                return arrSellers.get(0);
            }else{
                return null;
            }

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }


}
