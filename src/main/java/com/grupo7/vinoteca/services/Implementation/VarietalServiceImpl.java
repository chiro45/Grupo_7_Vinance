package com.grupo7.vinoteca.services.Implementation;


import com.grupo7.vinoteca.entities.Varietal;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.VarietalRepository;
import com.grupo7.vinoteca.repositories.WineRepository;
import com.grupo7.vinoteca.services.VarietalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VarietalServiceImpl extends BaseServiceImp<Varietal, Long> implements  VarietalService {

    @Autowired
    private VarietalRepository varietalRepository;

    public VarietalServiceImpl (BaseRepository<Varietal, Long> baseRepository){
        super(baseRepository);
    }

}
