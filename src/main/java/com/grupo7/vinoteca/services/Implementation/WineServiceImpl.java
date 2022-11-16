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

    public WineServiceImpl(BaseRepository<Wine, Long> baseRepository) {
        super(baseRepository);
    }

    //buscar vinos por nombre
    @Override
    public List<Wine> findWineForName(String name) throws Exception {
        try {

            List<Wine> arrWines = wineRepository.findByNameContaining(name);
            return arrWines;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForNamePaged(String name, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWines = wineRepository.findByNameContaining(name, pageable);
            return arrWines;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    //buscar vinos por varietal
    @Override
    public List<Wine> findWineForVarietal(String varietal) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineByVarietal_Varietal(varietal);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForVarietalPaged(String varietal, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineByVarietal_Varietal(varietal, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    //buscar vinos por precio
    @Override
    public List<Wine> findWineForPriceUpper(float price) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineByPriceGreaterThanEqual(price);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForPriceUpperPaged(float price, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineByPriceGreaterThanEqual(price, pageable);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineForPriceLower(float price) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineByPriceLessThanEqual(price);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForPriceLowerPaged(float price, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineByPriceLessThanEqual(price, pageable);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineForActive(boolean active) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineByActiveEquals(active);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForActivePaged(boolean active, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineByActiveEquals(active, pageable);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

   @Override
    public List<Wine> findWineForBrand(String brand) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineByBrand_Brand(brand);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForBrandPaged(String brand, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineByBrand_Brand(brand, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineForCategory(String category) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineByCategory_Category(category);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForCategoryPaged(String category, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineByCategory_Category(category, pageable);

            return arrWiness;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineHasStock(int stock) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineByStockGreaterThanEqual(stock);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineHasStockPaged(int stock, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineByStockGreaterThanEqual(stock, pageable);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}