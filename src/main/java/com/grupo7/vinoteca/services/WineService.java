package com.grupo7.vinoteca.services;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.entities.User;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.repositories.AccessoryRepository;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.WineRepository;
import com.grupo7.vinoteca.services.Implementation.BaseServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public interface WineService extends BaseService<Wine, Long> {

    Wine findWineForName(String name) throws Exception;

    List<Wine> findWineForVarietal(String varietal) throws Exception;

    List<Wine> findWineForPrice(String price) throws Exception;
}
