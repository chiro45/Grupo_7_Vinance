package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Brand;
import com.grupo7.vinoteca.entities.Category;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.BrandRepository;
import com.grupo7.vinoteca.repositories.CategoryRepository;
import com.grupo7.vinoteca.services.BrandService;
import com.grupo7.vinoteca.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl extends  BaseServiceImp<Brand, Long> implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    public BrandServiceImpl(BaseRepository<Brand, Long> baseRepository){
            super(baseRepository);
            }
}
