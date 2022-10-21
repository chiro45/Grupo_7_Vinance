package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.Brand;
import com.grupo7.vinoteca.entities.Category;
import com.grupo7.vinoteca.services.Implementation.BrandServiceImpl;
import com.grupo7.vinoteca.services.Implementation.CategoryServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/brands")
public class BrandController extends BaseControllerImpl<Brand, BrandServiceImpl> {
}
