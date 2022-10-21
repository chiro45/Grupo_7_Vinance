package com.grupo7.vinoteca.services.Implementation;

import com.grupo7.vinoteca.entities.Category;
import com.grupo7.vinoteca.repositories.BaseRepository;
import com.grupo7.vinoteca.repositories.CategoryRepository;
import com.grupo7.vinoteca.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl extends  BaseServiceImp<Category, Long> implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryServiceImpl (BaseRepository<Category, Long> baseRepository){
            super(baseRepository);
            }
}
