package com.grupo7.vinoteca.controllers;

import com.grupo7.vinoteca.controllers.BaseControllerImp.BaseControllerImpl;
import com.grupo7.vinoteca.entities.ImageAccessory;
import com.grupo7.vinoteca.services.Implementation.ImageAccessoryServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/imagesAccessory")
public class ImageAccessoryController extends BaseControllerImpl<ImageAccessory, ImageAccessoryServiceImpl> {
}
