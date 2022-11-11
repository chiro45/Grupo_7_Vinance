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
//    public Page<Wine> findWineForNamePaged(String name, Pageable pageable) throws Exception {
//        try {
//            Page<Wine> arrWines = wineRepository.findWineForNamePaged(name, pageable);
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
    public Page<Wine> findWineForVarietalPaged(String varietal, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineForVarietalPaged(varietal, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    //buscar vinos por precio
    @Override
    public List<Wine> findWineForPriceUpper(float price) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineForPriceUpper(price);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForPriceUpperPaged(float price, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineForPriceUpperPaged(price, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineForPriceLower(float price) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineForPriceLower(price);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForPriceLowerPaged(float price, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineForPriceLowerPaged(price, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineForPriceEquals(float price) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineForPriceEquals(price);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForPriceEqualsPaged(float price, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineForPriceEqualsPaged(price, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineForActive(boolean active) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineForActive(active);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForActivePaged(boolean active, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineForActivePaged(active, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineForBrand(String brand) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineForBrand(brand);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForBrandPaged(String brand, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineForBrandPaged(brand, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineForCategory(String category) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineForCategory(category);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForCategoryPaged(String category, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineForCategoryPaged(category, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineHasStock() throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineHasStock();

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineHasStockPaged(Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineHasStockPaged(pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }
}