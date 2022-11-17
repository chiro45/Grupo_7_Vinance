package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Accessory;
import com.grupo7.vinoteca.entities.Wine;
import com.grupo7.vinoteca.repositories.AccessoryRepository;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.services.AccessoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccessoryServiceImpl extends BaseServiceImp<Accessory, Long> implements AccessoryService {

    @Autowired
    private AccessoryRepository accessoryRepository;

    public AccessoryServiceImpl(BaseRepository<Accessory, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Accessory> findAccessoryByName(String name) throws Exception {
        try {
            List<Accessory> accessories = accessoryRepository.findAccesoryByName(name);
            if (accessories.size() > 0) {
                return accessories;
            } else {
                return null;
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Accessory> findAccessoryByNamePaged(String name, Pageable pageable) throws Exception {
        try {
            Page<Accessory> accessories = accessoryRepository.findAccesoryByNamePaged(name, pageable);
            return accessories;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<Accessory> findAccessoryByPriceLower(double price) throws Exception {
        try {
            List<Accessory> accessories = accessoryRepository.findAccesoryByPriceLower(price);
            return accessories;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Accessory> findAccessoryByPriceLowerPaged(double price, Pageable pageable) throws Exception {
        try {
            Page<Accessory> accessories = accessoryRepository.findAccesoryByPriceLowerPaged(price, pageable);
            return accessories;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    public List<Accessory> findAccessoryByPriceUpper(double price) throws Exception {
        try {
            List<Accessory> accessories = accessoryRepository.findAccesoryByPriceUpper(price);
            return accessories;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Accessory> findAccessoryByPriceUpperPaged(double price, Pageable pageable) throws Exception {
        try {
            Page<Accessory> accessories = accessoryRepository.findAccesoryByPriceUpperPaged(price, pageable);
            return accessories;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

   /* @Override
    public List<Accessory> findAccessoryByPriceEquals(float price) throws Exception {
        try {
            List<Accessory> accessories = accessoryRepository.findAccessoryByPriceEquals(price);

            return accessories;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Accessory> findAccessoryByPriceEqualsPaged(float price, Pageable pageable) throws Exception {
        try {
            Page<Accessory> accessories = accessoryRepository.findAccessoryByPriceEqualsPaged(price, pageable);

            return accessories;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }*/

    /*@Override
    public List<Accessory> findAccessoryByStock() throws Exception {
        try {
            List<Accessory> accessories = accessoryRepository.findAccessoryByStock();

            return accessories;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Accessory> findAccessoryByStockPaged(Pageable pageable) throws Exception {
        try {
            Page<Accessory> accessories = accessoryRepository.findAccessoryByStockPaged(pageable);

            return accessories;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }*/

   /* @Override
    public List<Accessory> findAccessoryByActive(boolean active) throws Exception {
        try {
            List<Accessory> accessories = accessoryRepository.findAccessoryByActive(active);

            return accessories;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Accessory> findAccessoryByActivePaged(boolean active, Pageable pageable) throws Exception {
        try {
            Page<Accessory> accessories = accessoryRepository.findAccessoryByActivePaged(active, pageable);

            return accessories;

        }catch ( Exception e){
            throw new Exception(e.getMessage());
        }
    }*/

}