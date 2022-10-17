package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.repositories.AccessoryRepository;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.SellerRepository;
import com.grupo7.vinoteca.services.Implementation.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public interface AccessoryService extends BaseServiceImp<Accessory, Long> {

}
