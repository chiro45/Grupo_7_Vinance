package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.WineRepository;
import com.grupo7.vinoteca.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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

//    @Override
//    public Page<Wine> findWineForName(String name, Pageable pageable) throws Exception {
//        try {
//            Page<Wine> arrWines = wineRepository.findWineForName(name, pageable);
//            return arrWines.get(0);
//        }catch ( Exception e){
//            throw new Exception(e.getMessage());
//        }
//    }

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

    @Override
    public Page<Wine> findWineForVarietal(String varietal, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineForVarietal(varietal, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    //buscar vinos por precio
    @Override
    public List<Wine> findWineForPrice(float price) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineForPrice(price);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForPrice(float price, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineForPrice(price, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

}