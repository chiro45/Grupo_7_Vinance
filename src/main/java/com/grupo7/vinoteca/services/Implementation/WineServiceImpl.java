package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.WineRepository;
import com.grupo7.vinoteca.services.WineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

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
            List<Wine> arrWines = wineRepository.findWineByVarietal_Varietal(varietal);
            int start  =(int) pageable.getOffset();
            int end = Math.min((start + pageable.getPageSize()), arrWines.size());
            Page<Wine> page = new PageImpl<>(arrWines.subList(start,end), pageable,arrWines.size() );
            return page;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    //buscar vinos por precio
    @Override
    public List<Wine> findWineForPriceUpper(double price) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineByPriceGreaterThanEqual(price);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForPriceUpperPaged(double price, Pageable pageable) throws Exception {
        try {
            Page<Wine> arrWiness = wineRepository.findWineByPriceGreaterThanEqual(price, pageable);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Wine> findWineForPriceLower(double price) throws Exception {
        try {
            List<Wine> arrWiness = wineRepository.findWineByPriceLessThanEqual(price);

            return arrWiness;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineForPriceLowerPaged(double price, Pageable pageable) throws Exception {
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
            List<Wine> arrWines = wineRepository.findWineByCategory_Category(category);

            int start  =(int) pageable.getOffset();
            int end = Math.min((start + pageable.getPageSize()), arrWines.size());
            Page<Wine> page = new PageImpl<>(arrWines.subList(start,end), pageable,arrWines.size() );
            return page;

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

    @Override
    public List<Wine> findWineByAll(String value) throws Exception {
        try {
            List<Wine> arrWines = wineRepository.findWineByBrand_Brand(value);
            arrWines.addAll( wineRepository.findWineByVarietal_Varietal(value));
            arrWines.addAll( wineRepository.findWineByCategory_Category(value));
            arrWines.addAll( wineRepository.findByNameContaining(value));
            return arrWines;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Wine> findWineByAllPaged(String value, Pageable pageable) throws Exception {
        try {
            List<Wine> arrWines = wineRepository.findWineByBrand_Brand(value);
            arrWines.addAll( wineRepository.findWineByVarietal_Varietal(value));
            arrWines.addAll( wineRepository.findWineByCategory_Category(value));
            arrWines.addAll( wineRepository.findByNameContaining(value));
            arrWines = arrWines.stream().distinct().collect(Collectors.toList());
            int start  =(int) pageable.getOffset();
            int end = Math.min((start + pageable.getPageSize()), arrWines.size());
            Page<Wine> page = new PageImpl<>(arrWines.subList(start,end), pageable,arrWines.size() );
            return page;

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }


}