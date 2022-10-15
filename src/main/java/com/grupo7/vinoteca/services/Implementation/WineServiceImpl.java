package com.grupo7.vinoteca.services.Implementation;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.WineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WineServiceImpl extends BaseServiceImp<Wine, Long> {

    @Autowired
    private WineRepository wineRepository;


    public WineServiceImpl(BaseRepository<Wine, Long> baseRepository){
        super(baseRepository);
    }


}
