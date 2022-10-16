package com.grupo7.vinoteca.services.Implementation;
import com.grupo7.vinoteca.entities.Seller;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.WineRepository;
import com.grupo7.vinoteca.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WineServiceImpl extends BaseServiceImp<Wine, Long> implements WineService {

    @Autowired
    private WineRepository wineRepository;


    public WineServiceImpl(BaseRepository<Wine, Long> baseRepository){
        super(baseRepository);
    }


    //buscar vinos por nombre
    @Override
    public Wine findWineForName(String name) throws Exception {
        try {
            List<Wine> arrWines = wineRepository.findWineForName(name);

            if(arrWines.size() > 0){

                return arrWines.get(0);
            }else{
                return null;
            }

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }
    //buscar vinos por varietal
    @Override
    public List<Wine> findWineForVarietal(String varietal) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineForVarietal(varietal);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    //buscar vinos por precio
    @Override
    public List<Wine> findWineForPrice(String price) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineForPrice(price);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

}
