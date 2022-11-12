package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Brand;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.BrandRepository;
import com.grupo7.vinoteca.services.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl extends  BaseServiceImp<Brand, Long> implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public BrandServiceImpl(BaseRepository<Brand, Long> baseRepository){
            super(baseRepository);
            }

    public boolean existsByBrand(String brand) {
        return brandRepository.existsByBrand(brand);
    }


    public List<Brand> findBrandByName(String name) throws Exception {
    try {
        List<Brand> brands = brandRepository.findBrandByName(name);
        if(brands.size() > 0){
            return brands;
        }else{
            return null;
        }
    }catch ( Exception e){
        throw new Exception(e.getMessage());
    }
    }

    public Optional<Brand> getByBrand(String brand) {
        return brandRepository.findByBrand(brand);
    }
}
